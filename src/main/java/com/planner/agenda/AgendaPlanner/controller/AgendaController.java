package com.planner.agenda.AgendaPlanner.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.planner.agenda.AgendaPlanner.models.Agenda;
import com.planner.agenda.AgendaPlanner.service.AgendaService;

@Controller
public class AgendaController {
	
	@Autowired
	private AgendaService agendaService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
		
	@RequestMapping(value="/adicionar", method=RequestMethod.GET)
	public String form() {
		return "agenda/formagenda";
	}    
	  
	
	@RequestMapping(value="/adicionar", method=RequestMethod.POST)
	public String form(Agenda anotacoes) {
		agendaService.salvarAnotacoes(anotacoes);	
		return "redirect:/adicionar";
	}    
	  
		
	@RequestMapping("/anotacoes")  
	public ModelAndView listarAnotacoes() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Agenda> anotacoes = agendaService.findAll();
		mv.addObject("anotacoes", anotacoes);
		return mv;
		
	}
	
	


}

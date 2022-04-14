package com.planner.agenda.AgendaPlanner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class agendaController {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/adicionar")
	public String form() {
		return "agenda/formagenda";
	}


}

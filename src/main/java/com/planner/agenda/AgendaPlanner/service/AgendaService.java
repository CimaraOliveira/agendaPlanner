package com.planner.agenda.AgendaPlanner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planner.agenda.AgendaPlanner.models.Agenda;
import com.planner.agenda.AgendaPlanner.repository.AgendaRepository;

@Service
public class AgendaService {
	
	@Autowired
	private AgendaRepository repository;
	
	public void salvarAnotacoes(Agenda anotacoes) {
		 repository.save(anotacoes);
	}
	
	public List<Agenda> findAll() {
		return repository.findAll();
	}

}

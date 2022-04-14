package com.planner.agenda.AgendaPlanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planner.agenda.AgendaPlanner.models.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
	
    Agenda findByNome(String username);

}

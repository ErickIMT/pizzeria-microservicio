package com.idat.ef.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ef.model.Pizza;
import com.idat.ef.repository.PizzaRepository;

@Service
public class PizzaService {

	@Autowired
	private PizzaRepository repo;
	
	public List<Pizza> listarTodo(){
		return repo.findAll();
	}
}

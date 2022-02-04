package com.idat.ef.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ef.model.Pizzeria;
import com.idat.ef.repository.PizzeriaRepository;

@Service
public class PizzeriaService {

	@Autowired
	private PizzeriaRepository repo;
	
	
	public List<Pizzeria> listarTodo(){
		return repo.findAll();
	}
}

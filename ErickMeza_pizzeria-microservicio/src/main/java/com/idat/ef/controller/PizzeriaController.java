package com.idat.ef.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.ef.model.Cliente;
import com.idat.ef.model.Pizza;
import com.idat.ef.model.Pizzeria;
import com.idat.ef.service.ClienteService;
import com.idat.ef.service.PizzaService;
import com.idat.ef.service.PizzeriaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin
@RequestMapping("/api/pizzeria")
@Api(tags = "Controlador Pizzeria")
public class PizzeriaController {

	@Autowired
	private ClienteService servC;
	@Autowired
	private PizzaService servPi;
	@Autowired
	private PizzeriaService servPz;
	
	@GetMapping("/listar/clientes")
	@ApiOperation(value = "Lista de Clientes")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Clientes Encontrados"),
			@ApiResponse(code = 401, message = "Mensaje Random")
	})
	public List<Cliente> listarClientes(){
		return servC.listarTodo();
	}
	
	@GetMapping("/listar/pizza")
	@ApiOperation(value = "Lista de Pizzas")
	public List<Pizza> listarPizzas(){
		return servPi.listarTodo();
	}
	
	@GetMapping("/listar/pizzeria")
	@ApiOperation(value = "Lista de Pizzerias")
	public List<Pizzeria> listarPizzerias(){
		return servPz.listarTodo();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

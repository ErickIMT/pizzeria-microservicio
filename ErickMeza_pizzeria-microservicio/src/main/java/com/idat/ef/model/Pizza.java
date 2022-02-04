package com.idat.ef.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "pizza")
@Data
public class Pizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPizza;
	private String nombrePizza;
	private String descripcion;
	@ManyToMany(mappedBy = "pizzasc", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private Set<Cliente> clientes;
	@ManyToMany(mappedBy = "pizzasp", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	private Set<Pizzeria> pizzerias;
}

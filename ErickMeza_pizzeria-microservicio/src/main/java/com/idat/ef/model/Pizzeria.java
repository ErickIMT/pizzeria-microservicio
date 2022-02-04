package com.idat.ef.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "pizzeria")
@Data
public class Pizzeria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPizzeria;
	private String direccion;
	private String sede;
	@ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinTable(name = "pizzeriaspizza", 
			joinColumns = @JoinColumn(referencedColumnName = "idPizzeria"),
			inverseJoinColumns = @JoinColumn(referencedColumnName = "idPizza"))
	private Set<Pizza> pizzasp = new HashSet<>();
}

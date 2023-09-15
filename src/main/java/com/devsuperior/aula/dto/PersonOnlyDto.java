package com.devsuperior.aula.dto;

public class PersonOnlyDto {

	private Long id;
	private String name;
	private Double salary;
	
	public PersonOnlyDto(){};
	
	public PersonOnlyDto(Long id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}
	
	
	
	
	
}

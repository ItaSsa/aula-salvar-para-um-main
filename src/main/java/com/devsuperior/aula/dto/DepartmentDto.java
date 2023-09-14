package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Department;

public class DepartmentDto {
	
	private Long id;
	private String name;
	
	public DepartmentDto(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public DepartmentDto(Department entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}

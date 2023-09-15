package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDto extends PersonOnlyDto {

	private Long departmentId;
	
	public PersonDto(Long id, String name, Double salary, Long departmentId) {
		super(departmentId, name, salary);
		this.departmentId = departmentId;
	}

	public PersonDto(Person entity) {
		super(entity.getId(),entity.getName(),entity.getSalary());
		departmentId = entity.getDepartment().getId();
	}

	public Long getDepartmentId() {
		return departmentId;
	}
	


}

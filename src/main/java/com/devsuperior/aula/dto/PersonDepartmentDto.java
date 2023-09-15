package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDepartmentDto extends PersonOnlyDto {
	
	private DepartmentDto  department;
	
	public PersonDepartmentDto(Long id, String name, Double salary, DepartmentDto department) {
		super(id, name, salary);
		this.department = department;
	}

	public PersonDepartmentDto(Person entity) {
		super(entity.getId(),entity.getName(),entity.getSalary());
		department = new DepartmentDto(entity.getDepartment());
	}

	public DepartmentDto getDepartment() {
		return department;
	}
	
	

}

package com.devsuperior.aula.dto;

public class PersonDepartmentDto {
	
	private Long id;
	private String name;
	private Double salary;
	
	private DepartmentDto  department;
	
	public PersonDepartmentDto(Long id, String name, Double salary, DepartmentDto department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
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

	public DepartmentDto getDepartment() {
		return department;
	}
	
	

}

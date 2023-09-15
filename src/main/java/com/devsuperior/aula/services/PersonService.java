package com.devsuperior.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aula.dto.DepartmentDto;
import com.devsuperior.aula.dto.PersonDepartmentDto;
import com.devsuperior.aula.dto.PersonDto;
import com.devsuperior.aula.dto.PersonOnlyDto;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;

@Service
public class PersonService {
	
		@Autowired
		private PersonRepository repository;
		
		@Autowired
		private DepartmentRepository departmentRepository;
		
		public PersonOnlyDto insert (PersonDepartmentDto dto) {
			Person person =  new Person();
			person.setName(dto.getName());
			person.setSalary(dto.getSalary());
			
			//To retrieve the date of department from the database
			Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId());
			
			//Department dept = new Department();
			//dept.setId(dto.getDepartment().getId());
			person.setDepartment(dept);
			
			person = repository.save(person);
			
			return new PersonDepartmentDto(person);
			

		}
		
		
		public PersonOnlyDto insert2 (PersonDto dto) {
			Person person =  new Person();
			person.setName(dto.getName());
			person.setSalary(dto.getSalary());
			
			
			Department dept = new Department();
			dept.setId(dto.getDepartmentId());
			person.setDepartment(dept);
			
			person = repository.save(person);
			
		   return new PersonDto(person);
		}
}

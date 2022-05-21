package com.program.Employeeprogram.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.program.Employeeprogram.exception.EmployeeNotFoundException;
import com.program.Employeeprogram.model.Employee;
import com.program.Employeeprogram.repository.EmployeeRepository;

@RestController
	public class EmployeeController{
		@Autowired
		EmployeeRepository employeeRepository;
		@GetMapping("/employees")
		public List<Employee> getAllEmployees() {
			return employeeRepository.findAll();
		}
			@PostMapping("/employees")
			public Employee addEmployee(@Validated @RequestBody Employee employee) {
				Employee getEmployee=employeeRepository.save(employee);
				return getEmployee;
			

			}
			
			@PutMapping("/employees/{id}")
public Employee updateemployee(@PathVariable(value="id") long id,@Validated @RequestBody 
		Employee employeeDetails)throws EmployeeNotFoundException{
			Employee employee= employeeRepository.findById(id)
						.orElseThrow(() ->new EmployeeNotFoundException(id));
			    employee.setId(employee.getId());
				employee.setName(employee.getName());
				employee.setSalary(employee.getSalary());
				employee.setDesignation(employee.getDesignation());
				Employee updateEmployee=employeeRepository.save(employee);
				return updateEmployee;
			}

}


	




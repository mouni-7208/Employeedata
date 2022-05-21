package com.program.Employeeprogram.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.program.Employeeprogram.model.Employee;
import com.program.Employeeprogram.repository.EmployeeRepository;

@Service
public abstract class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public List<Employee> getALLEmployees() {
	return ((JpaRepository<Employee, Long>) employeeRepository).findAll();
}
@Override
public void saveEmployee(Employee employee) {
this.employeeRepository.save(employee);
	
}


}







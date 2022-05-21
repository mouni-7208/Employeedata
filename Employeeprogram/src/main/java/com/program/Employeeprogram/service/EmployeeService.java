package com.program.Employeeprogram.service;

import java.util.List;


import com.program.Employeeprogram.model.Employee;

public interface EmployeeService {
	List <Employee> getALLEmployees();
	void saveEmployee (Employee employee);
	Employee getEmployeeById(long id);
}


package com.program.Employeeprogram.exception;

public class EmployeeNotFoundException extends Exception{

	private long id ;
	public EmployeeNotFoundException(long id) {
		super(String.format("Employee already exists in database : '%s'", id));

	
	}
}


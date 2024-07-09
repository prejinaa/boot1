package com.javainuse.bootmysqlcrud.exception;

import java.io.Serial;

public class EmployeeNotFoundException extends Exception {
	@Serial
	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException() {
	}

	public EmployeeNotFoundException(String message) {
		super(message);
	}

}

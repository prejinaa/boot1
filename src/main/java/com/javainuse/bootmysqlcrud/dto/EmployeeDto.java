package com.javainuse.bootmysqlcrud.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor

@Setter
@Getter
public class EmployeeDto {

	private Long id;
	private String name;
	private String department;

//	public EmployeeDto(Long id, String name, String department) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.department = department;
//	}
//
//	public EmployeeDto() {
//
//	}

}
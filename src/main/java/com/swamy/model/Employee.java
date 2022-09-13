package com.swamy.model;

import java.util.List;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee{

	private Integer empId;
	private String empName;
	private Double empSal;
	private List<String> projects;
}


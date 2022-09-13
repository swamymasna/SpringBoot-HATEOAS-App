package com.swamy.model;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product extends RepresentationModel<Product> {
// Use RepresentationModel<Product> in Binding class only.

	private Integer pid;
	private String pname;
	private Double pcost;
}

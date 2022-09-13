package com.swamy.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swamy.model.Product;

@RestController
@RequestMapping("/api")
public class ProductRestController {

	@GetMapping("/one/{pid}")
	public Product getOneProduct(@PathVariable Integer pid) {
		//Product prodObj = productRepository.getOneProduct(pid);
		Product p = new Product(99, "TV", 58000.00);

		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(ProductRestController.class).getAllProducts())
				.withSelfRel();
		p.add(link);
		return p;
	}

	@GetMapping("/list")
	public List<Product> getAllProducts() {
		List<Product> list = new ArrayList<>();
		list.add(new Product(100, "AC", 96000.00));
		list.add(new Product(101, "COOLER", 18000.00));
		return list;
	}

	// ------Using ResponseEntity<T>--------------------------------------//
	@GetMapping("/pob/{pid}")
	public ResponseEntity<Product> getOneProductById(@PathVariable Integer pid) {

		Product product = new Product(99, "TV", 58000.00);

		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(ProductRestController.class).getAllProducts())
				.withSelfRel();
		product.add(link);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
}

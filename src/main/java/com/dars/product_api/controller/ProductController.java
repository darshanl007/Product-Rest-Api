package com.dars.product_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dars.product_api.dto.Product;
import com.dars.product_api.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService service;

	// Saving one product
	@PostMapping("/products")
	public ResponseEntity<Object> saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	// Saving multiple products
	@PostMapping("/products/many")
	public ResponseEntity<Object> saveProducts(@RequestBody List<Product> products) {
		return service.saveProducts(products);
	}
}

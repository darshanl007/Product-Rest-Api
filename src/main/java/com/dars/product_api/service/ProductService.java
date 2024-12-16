package com.dars.product_api.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dars.product_api.dto.Product;
import com.dars.product_api.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;

	public ResponseEntity<Object> saveProduct(Product product) {
		repository.save(product);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", "Product Added Success");
		map.put("data", product);

		return new ResponseEntity<Object>(map, HttpStatus.CREATED);
	}

	public ResponseEntity<Object> saveProducts(List<Product> products) {
		repository.saveAll(products);

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", "Products Added Success");
		map.put("data", products);

		return new ResponseEntity<Object>(map, HttpStatus.CREATED);
	}

}

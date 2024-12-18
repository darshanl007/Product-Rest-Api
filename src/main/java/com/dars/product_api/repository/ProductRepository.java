package com.dars.product_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dars.product_api.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByName(String name);

}

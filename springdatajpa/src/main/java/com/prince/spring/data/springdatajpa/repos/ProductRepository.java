package com.prince.spring.data.springdatajpa.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prince.spring.data.springdatajpa.entities.Product;


public interface ProductRepository extends CrudRepository<Product, Long> {

	
}

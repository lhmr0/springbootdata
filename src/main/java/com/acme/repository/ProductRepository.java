package com.acme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.acme.entities.Product;

@Transactional
public interface ProductRepository extends CrudRepository<Product, Integer>{
}

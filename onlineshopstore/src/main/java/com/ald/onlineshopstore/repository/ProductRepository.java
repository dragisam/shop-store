package com.ald.onlineshopstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ald.onlineshopstore.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

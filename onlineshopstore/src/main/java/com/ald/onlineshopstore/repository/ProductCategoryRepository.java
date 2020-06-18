package com.ald.onlineshopstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ald.onlineshopstore.entity.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}

package com.ygornacif.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ygornacif.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}

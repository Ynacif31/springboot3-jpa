package com.ygornacif.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ygornacif.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

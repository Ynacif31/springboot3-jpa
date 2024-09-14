package com.ygornacif.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ygornacif.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

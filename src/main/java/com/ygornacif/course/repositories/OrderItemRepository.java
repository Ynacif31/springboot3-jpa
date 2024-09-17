package com.ygornacif.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ygornacif.course.entities.OrderItem;
import com.ygornacif.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}

package com.ygornacif.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ygornacif.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

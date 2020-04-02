package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

//nao é necessario colocar @Repository pois ela herda do JpaRepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

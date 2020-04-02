package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

//nao é necessario colocar @Repository pois ela herda do JpaRepository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

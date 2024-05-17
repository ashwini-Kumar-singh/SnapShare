package com.SnapShareapis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SnapShareapis.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}

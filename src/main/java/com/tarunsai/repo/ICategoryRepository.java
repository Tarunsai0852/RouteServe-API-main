package com.tarunsai.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tarunsai.entities.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, String> {

}
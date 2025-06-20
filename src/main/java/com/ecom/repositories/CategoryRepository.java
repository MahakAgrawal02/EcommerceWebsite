package com.ecom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    

}

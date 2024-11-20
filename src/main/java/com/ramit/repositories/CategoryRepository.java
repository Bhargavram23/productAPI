package com.ramit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ramit.models.ProductCategory;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<ProductCategory, Integer> {

}

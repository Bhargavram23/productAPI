package com.ramit.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ramit.models.Product;
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product, Integer> {
	Page<Product> findByCategoryCategoryId(@Param("id") Long id, Pageable pageable);

	Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);
}

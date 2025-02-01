package com.ramit.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
// some test
@Entity
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String name;
	String description;
	String title;
	Float unitPrice;
	String imageUrl;
	boolean active;
	Integer unitsInStock;
	@CreationTimestamp
	LocalDateTime dateCreated;
	@UpdateTimestamp
	LocalDateTime lastUpdated;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id",nullable = true)
	ProductCategory category;
	
}

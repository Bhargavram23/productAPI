package com.ramit.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


public class PurchaseItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer orderItemId;
	String imageUrl;
	Float unitPrice;
	Integer quantity;
	@ManyToOne()
	@JoinColumn(name = "productId")
	Product product;
	@ManyToOne()
	Purchase purchase;
}

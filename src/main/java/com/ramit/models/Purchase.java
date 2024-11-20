package com.ramit.models;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "customerOrder")
public class Purchase {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer orderId;
	@OneToMany(mappedBy = "purchase")
	Set<PurchaseItems> purchaseItems;
	Integer totalQuantity;
	Integer totalPrice;
	String orderStatus;
	LocalDateTime dateCreated;
	LocalDateTime lastCreated;
	Integer razorPayPaymentId;
	@ManyToOne
	@JoinColumn(name = "customerId")
	Customer customer;
	Integer addressId;
}

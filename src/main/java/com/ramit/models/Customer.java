package com.ramit.models;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer customerId;
	String name;
	String email;
	String phoneNumber;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	Set<ShippingAddress> address;
}

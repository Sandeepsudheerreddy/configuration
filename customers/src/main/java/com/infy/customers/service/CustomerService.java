package com.infy.customers.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.infy.customers.entity.Customer;
import com.infy.customers.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepo;

	// Fetches call details of a specific customer
	public Optional<Customer> getCustomerCallDetails(@PathVariable String email) {

		Optional<Customer> customerDetails = customerRepo.findById(email);

		return customerDetails;
	}
}

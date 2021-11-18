package com.infy.customers.controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.customers.entity.Customer;
import com.infy.customers.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {
		@Autowired
		CustomerService Service;

		// Fetches call details of a specific customer
		@GetMapping(value="/validation")
		public Optional<Customer> getCustomerCallDetails(@PathVariable String email) {

			return Service.getCustomerCallDetails(email);
		}

	}
	
	
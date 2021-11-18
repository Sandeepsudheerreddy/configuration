package com.infy.customers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.customers.entity.Customer;


	public interface CustomerRepository extends JpaRepository<Customer, String> {

		List<Customer> findByCalledBy(long sim);
	}


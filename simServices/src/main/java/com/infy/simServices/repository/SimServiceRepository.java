package com.infy.simServices.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.simServices.entity.SimService;

	public interface SimServiceRepository extends JpaRepository<SimService, String> {
		
		List<SimService> findAll();
		

	}


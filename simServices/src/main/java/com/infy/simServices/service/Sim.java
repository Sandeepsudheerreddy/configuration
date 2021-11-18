package com.infy.simServices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.infy.simServices.dto.SimServiceDTO;
import com.infy.simServices.entity.SimService;
import com.infy.simServices.repository.SimServiceRepository;

public class Sim {
	
	@Autowired
	SimServiceRepository Repo;

	// Fetches all plan details
	public List<SimServiceDTO> getAllPlans() {

		List<SimService> simplan = Repo.findAll();
		return null;

	}
}

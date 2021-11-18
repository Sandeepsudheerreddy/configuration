package com.infy.simServices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.simServices.dto.SimServiceDTO;
import com.infy.simServices.service.Sim;

@RestController
@RequestMapping("/sim")
public class simServicescontroller {
	
	@Autowired
	Sim Service;
	
	@GetMapping(value = "/validation")
	public List<SimServiceDTO> getAllPlans() {
		return Service.getAllPlans();

}
}
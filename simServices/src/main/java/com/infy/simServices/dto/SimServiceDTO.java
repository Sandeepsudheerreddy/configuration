package com.infy.simServices.dto;

import com.infy.simServices.entity.SimService;

public class SimServiceDTO {
	
	String sim;

	String serv;

	String status;
	
	public String getSim() {
		return sim;
	}



	public void setSim(String sim) {
		this.sim = sim;
	}



	public String getServ() {
		return serv;
	}



	public void setServ(String serv) {
		this.serv = serv;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public static SimServiceDTO valueOf(SimService p) {
		SimServiceDTO DTO= new SimServiceDTO();
		DTO.setSim(p.getSim());
		DTO.setServ(p.getServ());
	    DTO.setStatus(p.getStatus());
		return DTO;

}
}
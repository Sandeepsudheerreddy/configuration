package com.infy.simServices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SimService {
	@Id
	@Column
	String sim;
	@Column
	String serv;
	@Column
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
	
	

}

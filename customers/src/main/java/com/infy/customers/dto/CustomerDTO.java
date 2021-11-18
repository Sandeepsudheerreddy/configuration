package com.infy.customers.dto;

import java.sql.Date;

import com.infy.customers.entity.Customer;

public class CustomerDTO {

		String email;

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		public static CustomerDTO valueOf(Customer s) {
			CustomerDTO DTO= new CustomerDTO();
			DTO.setEmail(s.getEmail());
			return DTO;

}
}
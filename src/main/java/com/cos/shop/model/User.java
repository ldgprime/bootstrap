package com.cos.shop.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	private String phone;
	private String address;
	private Date createDate;
	
	@Builder
	public User(String username, String password, String email, String phone, String address) {	
		
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.address = address;
		
		
	}
	

	
	
}
package com.cos.shop.model;

import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	private int id;
	private int totalCount;
	private int totalprice;
	private int userId;
	private Date  createDate;
	
	
	@Builder
	public Payment(int totalCount, int totalprice, int userId) {
		super();
		this.totalCount = totalCount;
		this.totalprice = totalprice;
		this.userId = userId;
	}
	
	
	
	
	
	
}
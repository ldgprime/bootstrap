package com.cos.shop.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	private int id;
	private String productName;
	private int productPrice;
	private int niceCount;
	private int hateCount;
	
	
	@Builder
	public Product(String productName, int productPrice, int niceCount) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.niceCount = niceCount;
	}
		
	
	
	
	
}
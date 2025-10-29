package com.gkdigital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponseDto {

	private long orderId;
	
	 private String itemName;
	 
	 private double itemPrice;
	
	private int orderQuanity;
	
	private double orderPrice;
	

	
	
}

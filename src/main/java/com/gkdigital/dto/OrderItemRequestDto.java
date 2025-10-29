package com.gkdigital.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemRequestDto {

	
	private long orderItemId;
	
	private int orderItemQuantity;
	
	private double orderPrice;
	
	private double totalOrderPrice;
	
}

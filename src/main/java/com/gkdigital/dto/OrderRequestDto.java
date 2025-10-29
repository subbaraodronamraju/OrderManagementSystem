package com.gkdigital.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDto {

	private long orderId;
	
	private int orderQuantity;
	
	private double orderPrice;
	
	private List<OrderItemRequestDto> orderItemRequestDto;
	
	
	
}

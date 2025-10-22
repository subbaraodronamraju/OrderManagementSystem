package com.gkdigital.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor  
public class ItemRequestDto {

	@Column(nullable = false ,unique = true)
	private String itemName;
	
	@Column(nullable = false)
	private double itemPrice;
	
	 @Column(nullable = false)
	 private double itemStock;
	
}

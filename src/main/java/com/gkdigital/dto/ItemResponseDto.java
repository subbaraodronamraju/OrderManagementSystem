package com.gkdigital.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemResponseDto {
	
	 
	  private long itemId;

	 
	  private String itemName;
	 
	 
	  private double itemPrice;
	  
	 
	 private double itemRating;
	

	
	 private double itemStock;
	 
	
	 private boolean isAvailable;

	
	 
	 
	 
}

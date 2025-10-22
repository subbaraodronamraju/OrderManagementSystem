package com.gkdigital.service;

import java.util.List;

import com.gkdigital.dto.ItemRequestDto;
import com.gkdigital.dto.ItemResponseDto;



public interface ItemService  {
 
	public ItemResponseDto save(ItemRequestDto itemRequestDto);

	public List<ItemResponseDto> findAll();

	 
}

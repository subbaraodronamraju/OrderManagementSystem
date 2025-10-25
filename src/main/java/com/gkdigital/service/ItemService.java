package com.gkdigital.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gkdigital.dto.ItemRequestDto;
import com.gkdigital.dto.ItemResponseDto;


@Service
public interface ItemService  {
 
	public ItemResponseDto save(ItemRequestDto itemRequestDto);

	public List<ItemResponseDto> findAll();

	public ItemResponseDto getNameById(long id);

    public List<ItemResponseDto> addAllItems(List<ItemRequestDto> itemRequestDto);
	
		

	
		
		
	

	 
}

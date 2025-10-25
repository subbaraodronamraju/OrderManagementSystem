package com.gkdigital.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gkdigital.dto.ItemRequestDto;
import com.gkdigital.dto.ItemResponseDto;
import com.gkdigital.model.Item;



public interface ItemRepository extends JpaRepository<Item, Long> {
    
	public ItemRequestDto save(ItemResponseDto itemResponseDto);

	
	
	
	
}

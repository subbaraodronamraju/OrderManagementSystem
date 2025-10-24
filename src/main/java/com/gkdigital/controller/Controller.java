package com.gkdigital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gkdigital.dto.ItemRequestDto;
import com.gkdigital.dto.ItemResponseDto;
import com.gkdigital.service.ItemService;

@RestController
@RequestMapping("/items")
public class Controller {
	
   private final ItemService itemService;
   
    
	public Controller(ItemService itemService) {
	this.itemService = itemService;
}


	@PostMapping("/save")
	public ItemResponseDto save( @RequestBody ItemRequestDto itemRequestDto) {
		return itemService.save(itemRequestDto);
	}
	
	@GetMapping
	public List<ItemResponseDto> geAllItems() {
		return itemService.findAll();
		
		
	}
}

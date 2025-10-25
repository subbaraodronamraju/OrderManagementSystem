package com.gkdigital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@GetMapping("/{id}")
	public ItemResponseDto getNameById(@PathVariable(name="id") long id) {
	    return itemService.getNameById(id);
		
	}
	@PostMapping("/addAllItems")
	public List<ItemResponseDto> addAllItems(@RequestBody List<ItemRequestDto> itemRequestDto){
		return itemService.addAllItems(itemRequestDto);
	}
	
	@PutMapping("update/{id}")
	public ItemResponseDto  updateItem(@PathVariable(name="id") long id,@RequestParam(name="itemRating")double itemRating) {
		return itemService.updateItem(id,itemRating);
		
	}
	
}

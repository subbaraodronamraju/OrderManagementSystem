package com.gkdigital.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.gkdigital.dao.ItemRepository;
import com.gkdigital.dto.ItemRequestDto;
import com.gkdigital.dto.ItemResponseDto;
import com.gkdigital.model.Item;




@Service
public class ItemServiceImpl  implements ItemService{
	
      private final	ItemRepository itemRepository;
  
  

	public ItemServiceImpl(ItemRepository itemRepsitory) {
	this.itemRepository = itemRepsitory;
}



	@Override
	public ItemResponseDto save(ItemRequestDto itemRequestDto) {
	   Item item= new Item();
	   item.setItemName(itemRequestDto.getItemName());
	   item.setItemPrice(itemRequestDto.getItemPrice());
	   item.setItemRating(itemRequestDto.getItemStock());
	   item.setAvailable(true);
	   Item save = itemRepository.save(item);
	   ItemResponseDto itemResponseDto = new ItemResponseDto();
	   BeanUtils.copyProperties(save, itemResponseDto);
		return itemResponseDto;
	}



	@Override
	public List<ItemResponseDto> findAll() {
		List<Item> itemList = itemRepository.findAll();
		
		List<ItemResponseDto> itemResponse = new ArrayList<>();
		
		
		for(Item items:itemList) {
			ItemResponseDto item = new ItemResponseDto();
			
			BeanUtils.copyProperties(items, item);
			itemResponse.add(item);
		}
		  
		return itemResponse;
	}



	@Override
	public ItemResponseDto getNameById(long id) {
		Item itemById = itemRepository.findById(id).get();
		ItemResponseDto itemDto = new ItemResponseDto();
		BeanUtils.copyProperties(itemById, itemDto);
		return itemDto; 
	}



	@Override
	public List<ItemResponseDto> addAllItems(List<ItemRequestDto> itemRequestDto) {
         List<Item> itemsList = new ArrayList<>();
         
		
		for(ItemRequestDto items : itemRequestDto) {
			Item item = new Item();
			BeanUtils.copyProperties(items, item);
			itemsList.add(item);
		}
			List<Item> savedItems = itemRepository.saveAll(itemsList);
			List<ItemResponseDto> itemsDto= new ArrayList<>();
			for(Item savedItem: savedItems) {
				ItemResponseDto itemResponse = new ItemResponseDto();
				BeanUtils.copyProperties(savedItem, itemResponse);
				itemsDto.add(itemResponse);
				
			}
			
			return itemsDto;



	
		
	
		
	}


   



	
	



	


	


	
	
 
	
}

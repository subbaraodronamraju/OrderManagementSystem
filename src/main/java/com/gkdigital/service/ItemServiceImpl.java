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
	
      private final	ItemRepository itemRepsitory;
  
  

	public ItemServiceImpl(ItemRepository itemRepsitory) {
	this.itemRepsitory = itemRepsitory;
}



	@Override
	public ItemResponseDto save(ItemRequestDto itemRequestDto) {
	   Item item= new Item();
	   item.setItemName(itemRequestDto.getItemName());
	   item.setItemPrice(itemRequestDto.getItemPrice());
	   item.setItemRating(itemRequestDto.getItemStock());
	   item.setAvailable(true);
	   Item save = itemRepsitory.save(item);
	   ItemResponseDto itemResponseDto = new ItemResponseDto();
	   BeanUtils.copyProperties(save, itemResponseDto);
		return itemResponseDto;
	}



	@Override
	public List<ItemResponseDto> findAll() {
		List<Item> itemList = itemRepsitory.findAll();
		
		List<ItemResponseDto> itemResponse = new ArrayList<>();
		
		
		for(Item items:itemList) {
			ItemResponseDto item = new ItemResponseDto();
			
			BeanUtils.copyProperties(items, item);
			itemResponse.add(item);
		}
		  
		return itemResponse;
	}
 
	
}

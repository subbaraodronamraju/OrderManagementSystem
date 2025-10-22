package com.gkdigital.service;

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
 
	
}

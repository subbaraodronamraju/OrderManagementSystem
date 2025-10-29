package com.gkdigital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gkdigital.model.OrderItems;

public interface OrderItemsRepository extends JpaRepository<OrderItems, Long> {
	

}

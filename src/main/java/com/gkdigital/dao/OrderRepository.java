package com.gkdigital.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gkdigital.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}

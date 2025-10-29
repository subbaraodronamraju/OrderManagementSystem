package com.gkdigital.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orderId;
	
	private double orderPrice;
	
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
	private List<OrderItems> orderItems;

	public Order(double orderPrice, List<OrderItems> orderItems) {
		super();
		this.orderPrice = orderPrice;
		this.orderItems = orderItems;
	}
	
	
	
}

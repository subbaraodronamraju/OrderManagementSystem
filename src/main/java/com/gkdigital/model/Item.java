package com.gkdigital.model;






import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "items")
public class Item {
	
  @Id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long itemId;
  
  @Column(nullable = false ,unique = true)
  private String itemName;
  
  @Column(nullable = false)
  private double itemPrice;
  
  @Column(nullable = false)
  private double itemRating;
  
  @Column(nullable = false)
  private double itemStock;
  
  @Column(nullable = false)
  private boolean isAvailable;
  
 

  public Item(String itemName, double itemPrice, double itemRating, double itemStock, boolean isAvailable) {
	super();
	this.itemName = itemName;
	this.itemPrice = itemPrice;
	this.itemRating = itemRating;
	this.itemStock = itemStock;
	this.isAvailable = isAvailable;
  }
  
  
}

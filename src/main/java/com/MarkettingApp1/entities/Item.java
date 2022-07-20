package com.MarkettingApp1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Item")
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long itemId;
	private long orderId;
	private String itemName;
	private long itemUnitPrice;
	private long itemQuantity;
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public long getItemUnitPrice() {
		return itemUnitPrice;
	}
	public void setItemUnitPrice(long itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}
	public long getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(long itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	

}

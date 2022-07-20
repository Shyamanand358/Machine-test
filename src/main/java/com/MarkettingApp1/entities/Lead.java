package com.MarkettingApp1.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Lead {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long orderId;
	private Date orderDate;
	private String OrderStatus;
	private String collectionOfItems;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
	public String getCollectionOfItems() {
		return collectionOfItems;
	}
	public void setCollectionOfItems(String collectionOfItems) {
		this.collectionOfItems = collectionOfItems;
	}
	
	

}

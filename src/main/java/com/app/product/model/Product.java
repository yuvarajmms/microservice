package com.app.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="product_name")
	private String productName;
	@Column(name="product_category")
	private String category;
	@Column(name="product_price")
	private int price;
	@Column(name="product_location")
	private String location;
	@Column(name="product_backlog")
	private String backlog;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBacklog() {
		return backlog;
	}
	public void setBacklog(String backlog) {
		this.backlog = backlog;
	}
	public Product(int id, String productName, String category, int price, String location, String backlog) {
		super();
		this.id = id;
		this.productName = productName;
		this.category = category;
		this.price = price;
		this.location = location;
		this.backlog = backlog;
	}
	
	public Product() {}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", category=" + category + ", price=" + price
				+ ", location=" + location + ", backlog=" + backlog + "]";
	}
	
	
}

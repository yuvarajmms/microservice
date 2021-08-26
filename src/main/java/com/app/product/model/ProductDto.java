package com.app.product.model;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class ProductDto {

	private int id;
	private String productName;
	private String category;
	private int price;
	private String location;
	private String currency;
	@JsonIgnore
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
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getBacklog() {
		return backlog;
	}
	public void setBacklog(String backlog) {
		this.backlog = backlog;
	}
	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductDto [id=" + id + ", productName=" + productName + ", category=" + category + ", price=" + price
				+ ", location=" + location + ", currency=" + currency + ", backlog=" + backlog + "]";
	}
	
	
}

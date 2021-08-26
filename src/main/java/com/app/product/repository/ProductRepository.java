package com.app.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query("from Product where product_category=?1")
	public List<Product> getProductByCategory(String categoryName);
	
}

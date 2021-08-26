package com.app.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.app.product.model.ProductDto;
import com.app.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping
	public List<ProductDto> getAllProductDetails(){
	
		return productService.getAllProductInfo();
	}
	
	@GetMapping("/{id}")
	public ProductDto getProductById(@PathVariable("id") Integer id) {
		return productService.getProductById(id);
	}
	
	@GetMapping("/category")
	public List<ProductDto> getProductByCategory(@RequestParam(name = "category") String category){
		return productService.getProductByCategory(category);
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.CREATED)
	public ProductDto saveProduct(@RequestBody ProductDto productDto) {
		productService.saveProducts(productDto);
		return productDto;
	}
	
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.ACCEPTED)
	public ProductDto updateProductById(@RequestBody ProductDto productDto) {
		
		productService.updateProductById(productDto);		
		return productDto;
	}
}

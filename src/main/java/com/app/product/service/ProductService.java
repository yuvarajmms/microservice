package com.app.product.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.product.exception.EntityNotFoundException;
import com.app.product.model.Product;
import com.app.product.model.ProductDto;
import com.app.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public List<ProductDto> getAllProductInfo(){
		List<Product> productList = productRepository.findAll();
		
		return productList.stream().
				map(this::convertToDto).
				collect(Collectors.toList());
	}
	
	public ProductDto getProductById(Integer id) {
		Product product = productRepository.findById(id).
				orElseThrow(() -> new EntityNotFoundException("Product Details not found for id :"+id));
		return convertToDto(product);
	}
	
	public List<ProductDto> getProductByCategory(String categoryName){
		List<Product> productList = productRepository.getProductByCategory(categoryName);
		if(productList == null || productList.size() == 0) {
			throw new EntityNotFoundException("Product not found for the category :"+categoryName);
		} 
		return productList.stream().
				map(this::convertToDto).
				collect(Collectors.toList());
	}
	
	public ProductDto saveProducts(ProductDto productDto) {
		
		Product product = modelMapper.map(productDto, Product.class);
		product = productRepository.save(product);
		productDto.setId(product.getId());
		
		return productDto;
	}
	
	public ProductDto updateProductById(ProductDto productDto) {
		
		Product product = modelMapper.map(productDto, Product.class);
		
		productRepository.findById(product.getId()).
			orElseThrow(() -> new EntityNotFoundException("Product details not found for id :"+product.getId()+" to update"));
		
		productRepository.save(product);
		
		return productDto;
	}
			
	private Product convertToEntity(ProductDto productDto) {
		Product product = modelMapper.map(productDto, Product.class);
		return product;
	}
	
	private ProductDto convertToDto(Product product) {
		ProductDto productDto = modelMapper.map(product, ProductDto.class);
		return productDto;
	}
	
}

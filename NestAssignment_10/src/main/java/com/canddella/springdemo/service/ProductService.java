package com.canddella.springdemo.service;

import java.util.List;

import com.canddella.springdemo.entity.Customer;
import com.canddella.springdemo.entity.Product;

public interface ProductService {

	public List<Product> getProducts();

	public void saveProduct(Product theProduct);

	public Product getProduct(int theId);

	public void deleteProduct(int theId);
	
}

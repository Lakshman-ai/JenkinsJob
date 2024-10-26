package spring.boot.rest.api.service;

import java.util.List;

import spring.boot.rest.api.entity.Product;

public interface ProductService {

	
	List<Product> searchProducts(String query);
	Product createProduct(Product product);
	
	
	
}

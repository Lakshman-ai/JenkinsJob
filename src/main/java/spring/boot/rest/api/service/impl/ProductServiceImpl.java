package spring.boot.rest.api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import spring.boot.rest.api.entity.Product;
import spring.boot.rest.api.repository.ProductRepository;
import spring.boot.rest.api.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	public List<Product> searchProducts(String query) {

		List<Product> products = productRepository.searchProducts(query);

		return products;

	}

	@Override
	public Product createProduct(Product product) {

		return productRepository.save(product);

	}
}

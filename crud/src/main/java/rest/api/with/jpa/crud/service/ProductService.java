package rest.api.with.jpa.crud.service;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rest.api.with.jpa.crud.entity.Product;
import rest.api.with.jpa.crud.repository.ProductRepository;

@Service
public class ProductService {


	@Autowired
	private ProductRepository repository;

	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}

	public List<Product> getProducts() {
		return repository.findAll();
	}

	public Product getProductById(int id) {
		return repository.findById(id).orElse(null);
	}

	public List<Product> getProductByName(String name) {
		return repository.findByName(name);
	}

	public String deleteProductById(int id) {
		repository.deleteById(id);
		return "Product removed " + id;

	}

	public Product updateProductById(Product product) {
		Product existingProduct = repository.findById(product.getId()).orElse(null);
		if (existingProduct == null) {
			return null;
		} else {
			existingProduct.setId(product.getId());
			existingProduct.setName(product.getName());
			existingProduct.setPrice(product.getPrice());
			existingProduct.setQuantity(product.getQuantity());
			repository.save(existingProduct);
			return existingProduct;
		}

	}

}

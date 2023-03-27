package rest.api.with.jpa.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import rest.api.with.jpa.crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByName(String name);

}

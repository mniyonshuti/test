package edu.mum.cs.cs425.prodmgt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.prodmgt.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	List<Product> findProductsByUnitPriceGreaterThan(float unitPrice);
}

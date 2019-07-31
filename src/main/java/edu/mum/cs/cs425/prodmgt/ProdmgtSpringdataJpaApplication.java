package edu.mum.cs.cs425.prodmgt;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.prodmgt.model.Product;
import edu.mum.cs.cs425.prodmgt.repository.ProductRepository;

@SpringBootApplication
public class ProdmgtSpringdataJpaApplication implements CommandLineRunner{
	
	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ProdmgtSpringdataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product p = new Product(12222, "Niyo", 100, LocalDate.of(2018, 02, 13));
		Product savedProduct = saveProduct(p);
		System.out.println(savedProduct);
		
	}
	public Product saveProduct(Product p) {
		return this.repository.save(p);
	}

	List<Product> getSpecialProducts(){
		return repository.findProductsByUnitPriceGreaterThan(100);
		
	}
}

package com.prince.spring.data.springdatajpa;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.prince.spring.data.springdatajpa.entities.Product;
import com.prince.spring.data.springdatajpa.repos.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdatajpaApplicationTests {
	
	@Autowired
	ApplicationContext context;

	@Test
	public void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);
		Product product = new Product();
		product.setId(5L);
		product.setName("Mac");
		product.setDescription("Awesome");
		product.setPrice(1200d);
		
		//repository.save(product);
		
		
		Optional<Product> result = repository.findById(1L);
		if(result.isPresent()) {
			System.out.println(result);
		}else {
			System.out.println("No such id present!!");
		}
		
		//result.get().setPrice(1500d);
		
		repository.findAll().forEach(p->{System.out.println(p.getPrice());});
		

	}

}

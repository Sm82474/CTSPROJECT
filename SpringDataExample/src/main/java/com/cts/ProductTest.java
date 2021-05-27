package com.cts;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cts.model.Product;

public class ProductTest {

	public static void main(String[] args) {
		RestTemplate restTemplate= new RestTemplate();
		
		/*List<Product> resp=restTemplate.getForObject("http://localhost:9090/product/all",List.class);
		
		for(Product p:resp) {
			System.out.println(p);
		}*/
		
		Product p= restTemplate.getForObject("http://localhost:9090/product/search/1002",Product.class);
	
		System.out.println(p);
		
		restTemplate.delete("http://localhost:9090/product/delete/1002",Product.class);
	}
}

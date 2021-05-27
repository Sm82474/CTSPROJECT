package com.cts.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.ProductRepository;
import com.cts.exception.ProductNotFoundException;
import com.cts.model.Product;
import com.cts.service.ProductService;

@RestController

@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;

	
	//ProductRepository productRepository;

	@RequestMapping("/all")
	// @ResponseBody
	public ResponseEntity<List<Product>> allProduct() {

		try {
		//if (service.getAllProduct().size() != 0)
			return new ResponseEntity<List<Product>>(service.getAllProduct(), HttpStatus.OK);
			
		}
		catch(ProductNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		//return null;
	}

	@GetMapping("search/{id}")
	public ResponseEntity<Product> searchProduct(@PathVariable("id") int id) {

		try {
		//if (productRepository.findById(id).isPresent()) {
			//System.out.println("not null status ok");
			//System.out.println(service.findProduct(id));
			return new ResponseEntity<Product>(service.findProduct(id), HttpStatus.OK);
		//}
		} catch(ProductNotFoundException e){
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		//return null;
	}

	@PostMapping("/save")
	public ResponseEntity<Product> saveProduct(@RequestBody Product prd) {
		//Optional<Product> findById = productRepository.findById(prd.getId());
		try {
		//if (!findById.isPresent()) {
			return new ResponseEntity<Product>(service.addProduct(prd), HttpStatus.OK);
		//}
		}catch(ProductNotFoundException e){
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		//return null;
	}

	// @GetMapping("delete/{id}")
	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Product> deleteProduct(@PathVariable("id") int id) {

		//Optional<Product> findById = productRepository.findById(id);
		try {
		//if (findById.isPresent()) {
			return new ResponseEntity<Product>(service.deleteProduct(id), HttpStatus.OK);
		//} 
		}catch(ProductNotFoundException e) {
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
		}
		//return null;
	}
}

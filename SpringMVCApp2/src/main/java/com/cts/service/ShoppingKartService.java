package com.cts.service;
//business operations.

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cts.dao.ShoppingCartDao;
import com.cts.exception.ProductException;
import com.cts.model.Product;

@Service
public class ShoppingKartService {
	
	@Autowired
	ShoppingCartDao dao;

	
	public Product addProduct(Product product) throws ProductException {
		
		if(dao.searchProduct(product)!=null)
			throw new ProductException("Product is already present");
		else
			return dao.addProduct(product);
	}
	
	public Product searchProduct(Product product) throws ProductException {
		
		if(dao.searchProduct(product)==null)
			throw new ProductException("Product is not present");
		else 
			return dao.searchProduct(product);
	}
	
	public List<Product> showAllProducts() throws ProductException{
		
		if(dao.showAllProducts().size()==0) {
			throw new ProductException("Product list is empty");
			
		}
		else {
			return dao.showAllProducts();
		}
	}
	@ExceptionHandler(value=ProductException.class)
	public String productExceptionHandler() {
		return "error";
	}
}

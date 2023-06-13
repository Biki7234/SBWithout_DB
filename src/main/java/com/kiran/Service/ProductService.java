package com.kiran.Service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.kiran.Model.Product;

@Service
public interface ProductService {
	

	
	public boolean  saveproduct(Product product) ;
	public Product  getproductById(String productId) ;
	public List<Product> getAllProduct();
	
		
		
		
	

}

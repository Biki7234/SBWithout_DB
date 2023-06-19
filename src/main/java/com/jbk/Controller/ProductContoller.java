package com.jbk.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Model.Product;
import com.jbk.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductContoller {
	
	@Autowired
	private ProductService ps;
	
	@PostMapping("/save_product")
	
	public Product saveProduct(@RequestBody Product product) {
		
		return ps.saveProduct(product);
			}

}

package com.kiranController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiran.Model.Product;
import com.kiran.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/saveproduct")
	public boolean saveproduct(@RequestBody Product product) {
		return service.saveproduct(product);
	}
	@GetMapping("/getproduct/{ID}")
	public Product  getproductById(@PathVariable("Id" ) String  Id ) {
		return service.getproductById(Id);
		
	}
	@GetMapping("/getallproduct")
	public List<Product> getAllProduct(){
		return service.getAllProduct();
	}
	
		
}

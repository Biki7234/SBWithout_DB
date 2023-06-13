package com.kiran.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@GetMapping("/getproduct/{Id}")
	public Object  getproductById(@PathVariable("Id" ) String  Id ) {
		Product product=service.getproductById(Id);
		if(product!=null){
			return product;
		}else {
			return "Not Found";
			}
		
	}
	@GetMapping("/getallproduct")
	public List<Product> getAllProduct(){
		return service.getAllProduct();
	}
	@DeleteMapping("/deleteproduct")
	public String deleteProductById(@RequestParam("id") String id) {
		boolean isDeleted = service.deleteProductById(id);
		if (isDeleted) {
			return "deleted";
		} else {
			return "product not found to delete id= " + id;
		}
	}
	
	
	@PutMapping("/updateproduct")
	public String updateProduct(@RequestBody Product product) {
		boolean isUpdated = service.updateProduct(product);
		if (isUpdated) {
			return "updated";
		} else {
			return "product not found to update id= " + product.getProductId();
		}
	}
}

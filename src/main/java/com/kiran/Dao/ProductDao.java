package com.kiran.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kiran.Model.Product;
@Repository
public interface ProductDao {
	
public boolean saveproduct(Product product);
public Product  getproductById(String productId) ;
public List<Product> getAllProduct();


}

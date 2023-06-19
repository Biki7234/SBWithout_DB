package com.jbk.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jbk.Model.Product;
@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{

	
	public Product saveProduct(Product product);
}

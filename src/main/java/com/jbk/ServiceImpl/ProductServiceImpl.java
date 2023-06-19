package com.jbk.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.ProductDao;
import com.jbk.Model.Product;
import com.jbk.Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductDao pd;
	
	@Override
	public Product saveProduct(Product product) {

		return pd.save(product);
	}
	

}

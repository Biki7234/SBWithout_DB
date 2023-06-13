package com.kiran.ServiceIMPL;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiran.Dao.ProductDao;
import com.kiran.Model.Product;
import com.kiran.Service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao dao;
	
	@Override
	public boolean saveproduct(Product product) {
			String productId=new SimpleDateFormat("yyyymmddhhmmss").format(new java.util.Date());
	    product.setProductId(productId);
	     return dao.saveproduct(product);

}

	@Override
	public Product getproductById(String productId) {
		
		return dao.getproductById(productId);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return dao.getAllProduct();
	}

	@Override
	public boolean deleteProductById(String productId) {
	     
		return dao.deleteProductById(productId);
	}

	@Override
	public boolean updateProduct(Product product) {
		
		return dao.updateProduct(product);
	}
}

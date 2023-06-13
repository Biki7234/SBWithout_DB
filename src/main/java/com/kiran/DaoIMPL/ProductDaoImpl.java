package com.kiran.DaoIMPL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kiran.Dao.ProductDao;
import com.kiran.Model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
	
	List<Product> pp=new ArrayList<>();
	
	public ProductDaoImpl() {
		pp.add(new Product("1","pen",22,10,30,45));
		pp.add(new Product("2","pencil",2,18,30,30));
		pp.add(new Product("3","book",32,15,30,20));
		pp.add(new Product("4","rubber",42,12,30,12));
		pp.add(new Product("5","notes",26,11,30,23));
	}

	@Override
	public boolean saveproduct(Product product) {
		boolean isexist=false;
	for(Product dbproduct: pp) {
		if(dbproduct.getProductName().equalsIgnoreCase(product.getProductName())){
			isexist=true;
			break;
		}
	}
	if(!isexist) {
		pp.add(product);
		return true;}
	
		else {
			return false;
		}
	}

	@Override
	public Product getproductById(String productId) {
		Product product=null;
		for(Product dbproduct : pp) {
		if(dbproduct.getProductId().equals(productId)) {
			product=dbproduct;
	      break;
	}
}
	return product;
	
	}
	@Override
	public List<Product> getAllProduct() {
		
		return pp;
	}

	@Override

		public boolean deleteProductById(String productId) {
			boolean isDeleted = false;
			for (Product dbproduct : pp) {
				if (dbproduct.getProductId().equals(productId)) {
					pp.remove(dbproduct);
					isDeleted = true;
					break;
					}
			}
			return isDeleted;
		
	}

	@Override
	public boolean updateProduct(Product product) {
		boolean isUpdated = false;
		for (Product dbproduct : pp) {
			if (dbproduct.getProductId().equals(product.getProductId())) {
				pp.set(pp.indexOf(dbproduct), product);
				isUpdated = true;
				break;
			}
		}

		return isUpdated;

	}

	
}

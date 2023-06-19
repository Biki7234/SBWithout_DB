package com.jbk.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;

    @Column(name = "productname")
    private int productname;
   
    @Column(name = "productprice")
    private int productprice;

    @Column(name = "qty")
    private int product_quantity;

    @Column(name = "supplier_id")
    private int supplierId;

    public Product() {
    	
    	
    }
	public Product(int id, int productname, int productprice, int product_quantity, int supplierId) {
		super();
		this.id = id;
		this.productname = productname;
		this.productprice = productprice;
		this.product_quantity = product_quantity;
		this.supplierId = supplierId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductname() {
		return productname;
	}

	public void setProductname(int productname) {
		this.productname = productname;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productname=" + productname + ", productprice=" + productprice
				+ ", product_quantity=" + product_quantity + ", supplierId=" + supplierId + "]";
	}

    
    
  }

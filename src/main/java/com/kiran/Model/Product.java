package com.kiran.Model;

	public class Product {

	
		private String productId;
		private String productName;
		private int supplierId;
		private int categoryId;
		private int productQTY;
		private int productPrice;

		public Product() {
		}

		public Product(String productId, String productName, int supplierid, int categoryid, int productQTY,
				int productPrice) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.supplierId = supplierid;
			this.categoryId = categoryid;
			this.productQTY = productQTY;
			this.productPrice = productPrice;
		}

		public String getProductId() {
			return productId;
		}

		public void setProductId(String  productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public int getSupplierId() {
			return supplierId;
		}

		public void setSupplierId(int supplierId) {
			this.supplierId = supplierId;
		}

		public int getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}

		public Integer getProductQTY() {
			return productQTY;
		}

		public void setProductQTY(Integer productQTY) {
			this.productQTY = productQTY;
		}

		public int getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", supplierId=" + supplierId
					+ ", categoryId=" + categoryId + ", productQTY=" + productQTY + ", productPrice=" + productPrice + "]";
		}

	}


package com.cg.pms.service;

import java.util.List;

import com.cg.pms.exception.ProductException;
import com.cg.pms.bean.Product;

public interface ProductService {

	public boolean ValidateName(String productName);
	public int addProduct(Product productId)             throws ProductException;
    public Product findProductById (int productId)    throws ProductException;
    public Product deleteProductById (int productId)   throws ProductException;
    public List<Product> findAllProducts()             throws ProductException;
	
	
	
}

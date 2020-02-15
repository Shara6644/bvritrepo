package com.cg.pms.service;

import java.util.List;
import java.util.Random;

import com.cg.pms.bean.Product;
import com.cg.pms.dao.ProductDao;
import com.cg.pms.dao.ProductDaoMapImpl;
import com.cg.pms.exception.ProductException;

public class ProductServiceImpl implements ProductService{
	private ProductDao productDao;
	public ProductServiceImpl()
	{
		productDao=new ProductDaoMapImpl();
	}

	@Override
	public boolean ValidateName(String productName) {
		boolean flag = false;
		flag=productName.matches("[a-zA-z]");
		return flag;
	}

	@Override
	public int addProduct (Product product) throws  ProductException{
		String name=product.getProductName();
		boolean flag= ValidateName(name);
		if(!flag)
		{
			throw new ProductException("Product name must contain only alphabets");
		}
		Random random =new Random();
		int id = random.nextInt(1000)+100;
		product.setProductId(id);
		productDao.addProduct(product);
		return id;
	}

	@Override
	public Product findProductById(int productId) {
		String proId=String.valueOf(productId);
		boolean flag = proId.matches("[0-9]{4}");
		
		return null;
	}

	@Override
	public Product deleteProductById(int productId) {
		
		return null;
	}

	@Override
	public List<Product> findAllProducts() {
		
		return null;
	}

}

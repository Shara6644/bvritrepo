package com.cg.pms.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;

public class ProductDaoMapImpl implements ProductDao {
	private Map<Integer,Product> map=null;
	public ProductDaoMapImpl()
	{
	  map=new HashMap<Integer,Product>();	
	}

	@Override
	public int addProduct(Product product) throws ProductException
	{
		boolean flag= map.containsKey(product.getProductId());
		if(flag)
		{
			throw new ProductException("Id already exist");
		}
		else
		{
			map.put(product.getProductId(), product);
		}
		
		
		return product.getProductId();
	}

	@Override
	public Product findProductById(int productId) throws ProductException{
		Product product = null;
		boolean flag= map.containsKey(product.getProductId());
		
		if(flag)
		{
			int Id = product.getProductId();
		}
		else
		{
			throw new ProductException(productId+"Id does not exist");
		}
		return product;
	}

	@Override
	public Product deleteProductById(int productId) throws ProductException{
		Product product = null;
		boolean flag= map.containsKey(product.getProductId());
		
		if(flag)
		{
			product = map.remove(productId);
		}
		else
		{
			throw new ProductException(productId+"Id does not exist");
		}
		return product;
		
	}

	@Override
	public List<Product> findAllProducts() {
		 
	  
	    Collection col = map.values();
	    List<Product> list= new ArrayList<>(col);
		
		return list;
	}

}

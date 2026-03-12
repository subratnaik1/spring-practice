package com.subrat.service;

import java.util.List;

import com.subrat.sbeans.Product;

public interface IproductService {
	int addProduct(Product product) throws Exception;

	List<Product> retrieveAllProducts() throws Exception;

	int deleteProduct(int productId)throws Exception;

	int updateProduct(Product product) throws Exception;
}

package com.subrat.repository;

import java.util.List;

import com.subrat.sbeans.Product;

public interface IproductDAO {
	int insertProduct(Product product)throws Exception;
	List<Product> getAllProducts() throws Exception;
	int deleteProduct(int productId) throws Exception;
	int updateProduct(Product product) throws Exception;

}

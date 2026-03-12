package com.subrat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.subrat.sbeans.Product;
import com.subrat.service.IproductService;

@Controller("controller")
public class ProductController {
	@Autowired
	private IproductService iproductService;

	public int addProduct(Product product) throws Exception {

		return iproductService.addProduct(product);
	}

	public List<Product> retriveprod() throws Exception {

		return iproductService.retrieveAllProducts();
	}

	public int deleteProduct(int productID) throws Exception {

		return iproductService.deleteProduct(productID);
	}

	public int updateProduct(Product product) throws Exception {
		
		return iproductService.updateProduct(product);
	}
}

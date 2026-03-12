package com.subrat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subrat.repository.IproductDAO;
import com.subrat.sbeans.Product;

@Service
public class ProductService implements IproductService {
	@Autowired
	private IproductDAO iproductDAO;

	@Override
	public int addProduct(Product product) throws Exception {

		return iproductDAO.insertProduct(product);
	}

	@Override
	public List<Product> retrieveAllProducts() throws Exception {

		List<Product> list = iproductDAO.getAllProducts();
		list.forEach(p -> {
			IO.println(p.getProductID());
			IO.println(p.getProductName());
			IO.println(p.getDescription());
			IO.println(p.getPrice());
		});

		return list;

	}

	@Override
	public int deleteProduct(int productId) throws Exception {
		int deleteProduct = iproductDAO.deleteProduct(productId);
		if (deleteProduct > 0) {
			IO.println("record deleted");
		} else {
			IO.println("record not deleted");
		}
		return deleteProduct;
	}

	@Override
	public int updateProduct(Product product) throws Exception {

		return iproductDAO.updateProduct(product);
	}

}

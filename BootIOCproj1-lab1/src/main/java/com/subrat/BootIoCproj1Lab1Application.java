package com.subrat;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.subrat.controller.ProductController;
import com.subrat.sbeans.Product;

@SpringBootApplication
public class BootIoCproj1Lab1Application {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootIoCproj1Lab1Application.class, args);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice 1>insert \n 2>retrive \n 3>delete \n 4> update");
		int choice=Integer.parseInt(sc.nextLine());
		ProductController controller=ctx.getBean("controller",ProductController.class);

		switch(choice) {
		case 1->{
			System.out.println("enter product id");
			int productId = Integer.parseInt(sc.nextLine());
			System.out.println("enter product name");
			String productName = sc.nextLine();
			System.out.println("enter description");
			String description = sc.nextLine();
			System.out.println("enter price");
			double price = Double.parseDouble(sc.nextLine());
			
			Product p=new Product();
			p.setProductID(productId);
			p.setProductName(productName);
			p.setDescription(description);
			p.setPrice(price);
			
			controller.addProduct(p);
			System.out.println("product inserted");			
		}
		case 2->{
			controller.retriveprod();
		}
		case 3->{
			IO.println("enter product id");
			int productId = Integer.parseInt(sc.nextLine()); 
			controller.deleteProduct(productId);
		}
		case 4->{
			System.out.println("enter product id");
			int productId = Integer.parseInt(sc.nextLine());
			System.out.println("enter product name");
			String productName = sc.nextLine();
			System.out.println("enter description");
			String description = sc.nextLine();
			System.out.println("enter price");
			double price = Double.parseDouble(sc.nextLine());
			
			Product p=new Product();
			p.setProductID(productId);
			p.setProductName(productName);
			p.setDescription(description);
			p.setPrice(price);
			
			controller.updateProduct(p);
			IO.println("updated product");
		}
		}
	}

}

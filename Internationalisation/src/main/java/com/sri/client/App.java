package com.sri.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sri.cfgs.AppConfig;

public class App {
	
    public static void main(String[] args) {
      AnnotationConfigApplicationContext ctx = 
    		  new AnnotationConfigApplicationContext(AppConfig.class); 
      Scanner sc = new Scanner(System.in);
      System.out.println("provide country");
      String lang = sc.next();
  
      Locale locale =new Locale(lang);
      String msg1 = ctx.getMessage("welcome", new Object[] {"Levi", "Eren"}, locale);

      
      System.out.println(msg1);
      ctx.close();
      
    }
    
}

package com.client;


import com.venki.ProductService;
import com.venki.ProductServiceService;

public class App {
	
	
	public static void main(String[] args) {
		
		ProductServiceService pss = new ProductServiceService();
		ProductService port = pss.getProductServicePort();
		System.out.println(port.getProductCatagories());
	}

}

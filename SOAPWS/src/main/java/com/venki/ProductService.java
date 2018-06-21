package com.venki;

import java.util.*;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ProductService {
	
	ProductCatalog pc =new ProductCatalog();
	
	@WebMethod
	public List<String> getProductCatagories() {
		return pc.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String category) {
		return pc.getProducts(category);
	}
	
	@WebMethod
	public boolean addProduct(String category, String product) {
		return pc.addProduct(category, product);
	}

}

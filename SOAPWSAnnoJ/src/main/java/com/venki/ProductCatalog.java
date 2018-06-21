package com.venki;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
	
	List<String> carlist = new ArrayList<>();
	List<String> suvlist = new ArrayList<>();
	List<String> vanlist = new ArrayList<>();
	
	public ProductCatalog () {
		
		carlist.add("impala");
		carlist.add("altima");
		carlist.add("avalon");
		
		suvlist.add("journey");
		suvlist.add("compass");
		suvlist.add("pathfinder");
		
		vanlist.add("sienna");
		vanlist.add("oddessy");
		vanlist.add("explorer");
	
		
		
	}
	
		public List<String> getProductCategories() {
			List<String> categories = new ArrayList<>();
			categories.add("cars");
			categories.add("suvs");
			categories.add("vans");
			return categories;
			
		}
		
		public List<String> getProducts(String category) {
			switch(category) {
			case "cars" :
				return carlist;
				
			case "suvs":
				return suvlist;
				
			case "vans":
				return vanlist;
				
			}
			return null;
		}
		
		public boolean addProduct(String category, String product) {
			switch(category) {
			case "cars":
				carlist.add(product);
				break;
			case "suvs":
				suvlist.add(product);
				break;
			case "vans":
				vanlist.add(product);
				break;	
			default:
				return false;
			}
			return true;
			
		}
		
	
}

package com.Stream_API;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

class Product {
	int pid;
	String name;
	float price;

	public Product(int pid, String name, float price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

}

public class Tester {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(101, "HP Omen Laptop", 25000f));
		productsList.add(new Product(102, "Dell Inspiron Laptop", 30000f));
		productsList.add(new Product(103, "Lenevo Legion Laptop", 28000f));
		productsList.add(new Product(104, "Asus ROG Laptop", 28000f));
		productsList.add(new Product(105, "Apple Macbook", 90000f));

		// we are filtering input stream for highest price of laptop
		productsList.stream().filter(p -> p.price > 30000) // filtering price
				.map(pm -> pm.price) // fetching price
				.forEach(System.out::println); // iterating price
		
		
	}
}
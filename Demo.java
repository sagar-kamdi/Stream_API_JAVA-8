package com.Stream_API;

//a simple program to demonstrate the use of stream in java 
import java.util.*;
import java.util.stream.*;

class Demo {
	public static void main(String args[]) {

		// create a list of integers
		List<Integer> number = Arrays.asList(2, 3, 4, 5);

		// demonstration of map method
		List<Integer> square = number.stream()
				.map(x -> x * x)
				.collect(Collectors.toList());
		System.out.println("map method to sqaure the nunmbers--->\n"+square);
		System.out.println("--------------------------------------");

		// create a list of String
		List<String> names = Arrays.asList("Sagar", "Zensar", "Aspiring", "Minds");

		// demonstration of filter method
		List<String> result = names.stream()
				.filter(s -> s.contains("a"))
				.collect(Collectors.toList());
		System.out.println("demonstration of filter method---->\n" + result);
		System.out.println("--------------------------------------");

		// demonstration of sorted method
		List<String> show = names.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println("sorted method to sort names-->\n" + show);
		System.out.println("--------------------------------------");

		// create a list of integers
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 23, 4);

		// collect method returns a set
		Set<Integer> squareSet = numbers.stream()
				.map(x -> x * x)
				.collect(Collectors.toSet());
		System.out.println("SQUARESET----->\n"+squareSet);
		System.out.println("--------------------------------------");

		// demonstration of forEach method
		number.stream().map(x -> x * x)
		.forEach(y -> System.out.println(y));
		System.out.println("--------------------------------------");

		// demonstration of reduce method
		int even = number.stream()
				.filter(x -> x % 2 == 0)
				.reduce(0, (ans, i) -> ans + i);

		System.out.println(even);
		System.out.println("--------------------------------------");
	}
}

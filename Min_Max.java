package com.Stream_API;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

public class Min_Max {

	public static void main(String[] args) {
		Random rand = new Random(); 
		
		// Get Min or Max Number
		Integer maxNumber = Stream.of(rand.nextInt(1000))
		                    .max(Comparator.comparing(Integer::valueOf))
		                    .get();
		 
		Integer minNumber = Stream.of(rand.nextInt(1000))
		                    .min(Comparator.comparing(Integer::valueOf))
		                    .get();
		
		
		 
		System.out.println("maxNumber = " + maxNumber);
		System.out.println("minNumber = " + minNumber);
	}

}

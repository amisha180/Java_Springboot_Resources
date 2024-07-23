package com.java.practice.day_1;

import java.util.stream.IntStream;

public class Imperative_vs_Declarative_1 {

	public static void main(String[] args) {

//		Imperative Style
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum is  : " + sum);

//		Declarative Style
		int resSum = IntStream.rangeClosed(0, 100)
				//.parallel() // It splits the values and perform the summation in multi-threaded environment
				//.map(Integer::new)
				.sum();
		System.out.println("Result is : " + resSum);

	}

}

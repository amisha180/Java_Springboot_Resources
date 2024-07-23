package com.java.practice.day_2;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		// Greater than
		Predicate<Integer> p = a -> (a > 30);
		System.out.println(p.test(24));
		System.out.println(p.test(34));

		// Length of String
		Predicate<String> q = a -> (a.length() > 30);
		System.out.println(q.test("Ravi Pratap"));
		System.out.println(q.test("Aman Srivastav"));

		// Predicate Joins
		int[] inputArray = { 10, 20, 30, 40, 50, 61, 79, 89, 83, 90 };
		Predicate<Integer> p2 = z -> z > 40;
		Predicate<Integer> p3 = y -> y % 2 == 0;

		System.out.println("Condition : Greater than 40");
		predicateFunction(p2, inputArray);

		System.out.println("Condition : Less than 40");
		predicateFunction(p2.negate(), inputArray);

		System.out.println("Condition : Even numbers");
		predicateFunction(p3, inputArray);

		System.out.println("Condition : Greater than 40 AND Even");
		predicateFunction(p2.and(p3), inputArray);
		
		System.out.println("Condition : Greater than 40 OR Even");
		predicateFunction(p2.or(p3), inputArray);

	}

	static void predicateFunction(Predicate<Integer> p, int[] inputArray) {
		for (int num : inputArray) {
			if (p.test(num)) {
				System.out.print(num+" ");
			}
		}
		System.out.print("\n");
	}

}

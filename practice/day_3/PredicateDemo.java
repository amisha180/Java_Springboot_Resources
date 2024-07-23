package com.java.practice.day_3;

import java.util.function.Predicate;

public class PredicateDemo {

	public static Predicate<Integer> predicate_1 = (i) -> {
		return i % 2 == 0;
	};

	public static Predicate<Integer> predicate_2 = (i) -> i % 2 == 0;
	public static Predicate<Integer> predicate_3 = (i) -> i % 5 == 0;

	// AND Operation
	public static void predicateAND() {
		System.out.println("Result using AND are : " + predicate_1.and(predicate_2).test(10));
	}
	// OR Operation
	public static void predicateOR() {
		System.out.println("Result using AND are : " + predicate_1.or(predicate_2).test(4));
	}
	// NEGATE Operation
	public static void predicateNEGATE() {
		System.out.println("Result using Negate : " + predicate_1.or(predicate_2).negate().test(4));
	}
	public static void main(String[] args) {

		System.out.println("Result for Predicate_1 : "+predicate_1.test(2));
		System.out.println("Result for Predicate_2 : "+predicate_2.test(3));
		
		predicateAND();
		predicateOR();
		predicateNEGATE();
	}

}

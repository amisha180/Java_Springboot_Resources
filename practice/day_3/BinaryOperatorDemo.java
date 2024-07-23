package com.java.practice.day_3;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	static Comparator<Integer> c = (a, b) -> a.compareTo(b);

	public static void main(String[] args) {
		BinaryOperator<Integer> binaryOperator = (a, b) -> (a * b);
		System.out.println(binaryOperator.apply(6, 8));

		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		System.out.println(maxBy.apply(98, 11));

		BinaryOperator<Integer> minBy = BinaryOperator.minBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));
		System.out.println(minBy.apply(10, 11));

	}

}

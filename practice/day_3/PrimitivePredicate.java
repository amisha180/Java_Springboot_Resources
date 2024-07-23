package com.java.practice.day_3;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

public class PrimitivePredicate {

	static IntPredicate x = (a) -> a % 2 == 0;
	static DoublePredicate y = (a) -> a % 4.0 == 0;

	public static void main(String[] args) {
		System.out.println(x.test(3));
		System.out.println(y.test(16));
	}

}

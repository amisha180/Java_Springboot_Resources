package com.java.practice.day_3;

import java.util.function.Function;

public class FunctionDemo {
	static Function<String, String> upperCase = (name) -> name.toUpperCase();
	static Function<String, String> addString = (name) -> name.toUpperCase().concat("Srivastav");

	public static void main(String[] args) {
		System.out.println("Result is : " + upperCase.apply("ravi pratap srivastav"));

		System.out.println("Result of andThen : " + upperCase.andThen(addString).apply("Ravi "));

		System.out.println("Result of Compose : " + upperCase.compose(addString).apply("ravi "));
		
		Function<String, String> fun = Function.identity();
		System.out.println(fun.apply("Ravi"));
	}

}

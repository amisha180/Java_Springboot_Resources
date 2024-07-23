package com.java.practice.day_1;

import java.util.function.Consumer;

public class LambdaVariable_1 {

	public static void main(String[] args) {
		int x = 0; // Local variable
		//Repeated variable name not allowed
		Consumer<Integer> consumer = (x1) -> {
			// int x = 1; same variable can not redeclare or reinitialize 
			System.out.println(x1);
		};
	}

}

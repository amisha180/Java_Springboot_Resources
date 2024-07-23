package com.java.practice.day_1;

import java.util.function.Consumer;

public class LambdaVariable_2 {
	static int y=5;
	public static void main(String[] args) {
		//int y=5;
		//Effectively final and we cannot change the variable value if it is declare as local variable
		
		Consumer<Integer> consumer = (num)->{
			num = 10;
			System.out.println(y+num);
		};
	}

}

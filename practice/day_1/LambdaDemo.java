package com.java.practice.day_1;

interface Sample {
	public void function();
}

public class LambdaDemo {

	public static void main(String[] args) {
		int x = 100;
//		Without Using Lambda
		Sample sample = new Sample() {
			@Override
			public void function() {
				System.out.println("Result is : " + x);
			}
		};
		sample.function();
//		With Lambda
		Sample sam = ()->{
			System.out.println("Result is : " + x);
		};
		sam.function();
	}
}

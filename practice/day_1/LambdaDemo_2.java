package com.java.practice.day_1;

interface SampleInterface {
	int add(int a, int b);
}

public class LambdaDemo_2 {

	public static void main(String[] args) {
		SampleInterface interface1 = (a, b)->a + b;
		System.out.println("Addition:" + interface1.add(1000, 2000));
		
		SampleInterface interface2 = (a, b) -> {
			return a + b;
		};
		System.out.println("Addition:" + interface2.add(2000, 2000));
		
		SampleInterface interface3 = (int a, int b)->a + b;
		System.out.println("Addition:" + interface3.add(3000, 2000));
	}

}

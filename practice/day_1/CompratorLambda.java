package com.java.practice.day_1;

import java.util.Comparator;

public class CompratorLambda {
	public static int compareTwoIntegers(Comparator<Integer> comparator, int a, int b) {
		return comparator.compare(a, b);
	}

	public static void main(String[] args) {
		Comparator<Integer> comparator1 = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}

		};
		System.out.println(comparator1.compare(10, 20));
		Comparator<Integer> comparator2 = (a, b) -> {
			return a.compareTo(b);
		};
		System.out.println(comparator2.compare(30, 20));
		
		Comparator<Integer> comparator3 = (Integer a, Integer b) -> {
			return a.compareTo(b);
		};
		System.out.println(comparator3.compare(30, 30));
		
		Comparator<Integer> comparator4 = (Integer a, Integer b) -> {
			return a.compareTo(b);
		};
		System.out.println(comparator4.thenComparing(comparator4).compare(30, 50));
		
		
	}

}
//if both are equal then 0
//if first is greater than second 1
//if second is greater than first -1
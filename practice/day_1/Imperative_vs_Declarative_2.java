package com.java.practice.day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Imperative_vs_Declarative_2 {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 9, 9);
		List<Integer> uniqueList = new ArrayList<>();
		for (Integer i : intList) {
			if (!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		System.out.println("Unique Element List using Imperative Style:"+ uniqueList);
		
		List<Integer> uniqList = intList.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Element List Using Declarative Style:"+ uniqList);
	}

}

package com.java.practice.day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterList {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "pqr", "xyz");

		// By using java 8
		list.stream().filter(msg -> !"abc".equals(msg)).collect(Collectors.toList())
				.forEach(x -> System.out.println(x));

		// By using Imperative Style
		System.out.println("Filtered List when message string is not [abc]");
		List<String> result = filterList(list, "abc");
		for (String res : result) {
			System.out.println(res);
		}

	}

	private static List<String> filterList(List<String> stringList, String msg) {
		List<String> resultList = new ArrayList<>();
		for (String str : stringList) {
			if (!(msg.equals(str))) {
				resultList.add(str);
			}
		}
		return resultList;
	}
}

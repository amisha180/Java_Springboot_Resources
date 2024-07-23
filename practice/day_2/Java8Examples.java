package com.java.practice.day_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Examples {

	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(10,20,30,40,50,60);
		stream1.forEach(System.out::println);
		
		Stream<Integer> stream2 = Stream.of(new Integer[] {10,20,30,40,50,60});
		stream2.forEach(System.out::println);
		
		ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(10,15,25,35,45,50));
		System.out.println(l1);
		Stream<Integer> stream3 = l1.stream();
		//System.out.println(stream3); // will not print
		//stream3.forEach(System.out::println);
		
		Stream<Date> date = Stream.generate(()->{
			return new Date();
		});
		//date.forEach(System.out::println);
		
		Stream<String> str = Stream.of("A$B$C".split("\\$"));
		str.forEach(System.out::println);
		
		List<Integer> list = stream3.filter(i-> i%2 == 0).collect(Collectors.toList());
		list.forEach(System.out::println);
		
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList("abc","pqr","arst","axyz","bcsd"));
		names.stream().filter((p)-> p.startsWith("a")).forEach(System.out::println);
		names.stream().filter((p)-> p.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);
		names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
	}

}

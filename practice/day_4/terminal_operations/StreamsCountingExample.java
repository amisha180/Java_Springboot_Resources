package com.java.practice.day_4.terminal_operations;

import java.util.stream.Collectors;

import com.java.practice.data.StudentDataBase;

public class StreamsCountingExample {

	public static long count() {
		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9)
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {

		System.out.println(count());
	}
}

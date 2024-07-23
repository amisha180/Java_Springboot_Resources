package com.java.practice.day_3;

import java.util.function.Function;
import java.util.function.Supplier;

import com.java.practice.data.Student;

public class ConstructorReference {

	static Supplier<Student> studentSupplier = Student::new;
	// if you are using

	static Function<String, Student> studentFunction = Student::new;

	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println(studentFunction.apply("Geetha"));
	}

}

package com.java.practice.day_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.java.practice.data.Student;
import com.java.practice.data.StudentDataBase;

public class SupplierDemo {

	public static Supplier<Student> studentSupplier_1 = () -> {
		return new Student("Adam", 2, 4.0, "male", Arrays.asList("swimming", "basketball", "volleyball"));
	};
	public static Supplier<List<Student>> studentSupplier_2 = () -> {
		return StudentDataBase.getAllStudents();
	};

	public static void main(String[] args) {
		System.out.println("Student Data is : " + studentSupplier_1.get());
		System.out.println("Students Data are : " + studentSupplier_2.get());
	}

}

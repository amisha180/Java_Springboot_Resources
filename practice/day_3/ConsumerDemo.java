package com.java.practice.day_3;

import java.util.List;
import java.util.function.Consumer;

import com.java.practice.data.Student;
import com.java.practice.data.StudentDataBase;

public class ConsumerDemo {

	static Consumer<Student> consumer_1 = p -> System.out.println(p);
	static Consumer<Student> consumer_2 = p -> System.out.println(p.getName().toUpperCase());
	static Consumer<Student> consumer_3 = p -> System.out.println(p.getActivities());
	static Consumer<String> consumer_4 = p -> System.out.println(p.toUpperCase());

	public static void printStudentName() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		studentList.forEach(consumer_1);
	}

	public static void printStudentNameAndActivities() {
		System.out.println("Students Name and Activities are :");
		List<Student> studentList_1 = StudentDataBase.getAllStudents();
		studentList_1.forEach(consumer_2.andThen(consumer_3));
	}

	public static void printStudentNameAndActivitiesUsingCondition() {
		System.out.println("Students Name and Activities Using condition are :");
		List<Student> studentList_2 = StudentDataBase.getAllStudents();
		studentList_2.forEach((s)->{
			if(s.getGradeLevel()>=3 && s.getGpa()>3.9) {
				consumer_2.andThen(consumer_3).accept(s);
			}
		});
	}

	public static void main(String[] args) {
		Consumer<String> consumer_1 = (s)->System.out.println(s.toUpperCase());
		consumer_1.accept("abhisekh");
		printStudentName();
		printStudentNameAndActivities();
		printStudentNameAndActivitiesUsingCondition();
		consumer_4.accept("surabhi gupta");
		
	}

}

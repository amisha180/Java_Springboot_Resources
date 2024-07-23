package com.java.practice.day_2;

public interface Employee {
	public void populate();
	default void display() {
		System.out.println("Welcome to default method");
	}
	default void process() {
		System.out.println("Hello Folks,Welcome to default method");
	}
}

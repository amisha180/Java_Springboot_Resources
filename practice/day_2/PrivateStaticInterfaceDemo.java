package com.java.practice.day_2;

interface MyInterface{
	static void method1(){
	//default void method1(){
		//calling static & private method
		//f1();
		System.out.println("In method 1");
	}
	static void method2(){
	//default void method2(){
		//f1()
		System.out.println("In method 2");
	}
//	static void f1() {
//		System.out.println("Static method");
//	}
	//private void f1() {
//		System.out.println("Static method");
//	}
}
public class PrivateStaticInterfaceDemo implements MyInterface{

	public static void main(String[] args) {
		PrivateStaticInterfaceDemo psid = new  PrivateStaticInterfaceDemo();
//		psid.method1();
//		psid.method2();
		MyInterface.method1();
		MyInterface.method2();

	}

}

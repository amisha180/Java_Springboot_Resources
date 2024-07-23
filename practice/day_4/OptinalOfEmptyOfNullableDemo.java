package com.java.practice.day_4;

import java.util.Optional;

public class OptinalOfEmptyOfNullableDemo {

	public static Optional<String> ofNullable(){
		Optional<String> opt = Optional.ofNullable("Welcome Folks");
		return opt;
		// OR
		// return Optional.ofNullable("Welcome Folks");
		
	}
	public static Optional<String> of(){
		return Optional.of("Welcome folks");
	}
	public static Optional<String> empty(){
		return Optional.empty();
		//return Optional.of(null);
	}
	public static void main(String[] args) {
		System.out.println(ofNullable());
		System.out.println(ofNullable().get());
		System.out.println(ofNullable().isPresent());
		//System.out.println(ofNullable().isEmpty());
		
		System.out.println(ofNullable());
		System.out.println(ofNullable().get());
		System.out.println(ofNullable().isPresent());
		//System.out.println(ofNullable().isEmpty());
		
		System.out.println(empty());
	}

}

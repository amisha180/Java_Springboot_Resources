package com.java.practice.day_4;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

		Optional<String> optional_1 = Optional.ofNullable("Welcome Folks");
		System.out.println(optional_1.isPresent());
		// System.out.println(optional_1.isEmpty());
		Optional<String> optional_2 = Optional.ofNullable(null);
		System.out.println(optional_2.isPresent());
		optional_1.ifPresent((s -> System.out.println("Value is : " + s)));

		Object objVal_1 = Optional.ofNullable("Hello Folks").orElseGet(() -> "Default Value");
		System.out.println(objVal_1);
		Object objVal_2 = Optional.ofNullable(null).orElseGet(() -> "Default Value");
		System.out.println(objVal_2);

		Optional.ofNullable("Hello Ravi Srivastav").ifPresent(value -> System.out.println(value));
		Optional.ofNullable("Hello Ravi Srivastav").ifPresent(System.out::println);

		Optional.ofNullable("ravi.srivastav@gmail.com")
				.ifPresent(email -> System.out.println("Sending email to : " + email));
//		Optional.ofNullable("ravi.srivastav@gmail.com").ifPresentOrElse(email -> System.out.println("Sending email to : " + email), () -> {
//					System.out.println("Cannot sent the email");
//				});
		
//		Optional.ofNullable("nagendra@gmail.com")
//		// .ifPresent(email -> System.out.println("Sending the email to : "+ email));
//		.ifPresentOrElse(
//				email -> System.out.println("Sending the email to : "+ email),
//				() -> {
//					System.out.println("Cannot Send the email");
//				});
	}

}

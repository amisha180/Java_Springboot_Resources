package com.java.practice.day_2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		List<Developer> listDevs = getDevelopers();
		System.out.println("---------------------------------------------------------");
		System.out.println("       [ Normal List : Based on Natural Order]           ");
		System.out.println("---------------------------------------------------------");
		listDevs.forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		System.out.println("        [ Sorted List : Based on AGE ]");
		System.out.println("---------------------------------------------------------");
		listDevs.sort((Developer d1,Developer d2)->d1.getAge() - d2.getAge());
		listDevs.forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		System.out.println("  [ Sorted List in Reverse order : Based on SALARY ]");
		System.out.println("---------------------------------------------------------");
		Comparator<Developer> salaryCompartor = (d1,d2) ->d1.getSalary().compareTo(d2.getSalary());
		listDevs.sort(salaryCompartor.reversed());
		listDevs.forEach(System.out::println);
	}

	private static List<Developer> getDevelopers() {
		List<Developer> developersLIst = new ArrayList<>();
		developersLIst.add(new Developer("Ravi Pratap Srivastav", new BigDecimal("94000"), 32));
		developersLIst.add(new Developer("Aman Srivastav", new BigDecimal("90000"), 36));
		developersLIst.add(new Developer("Poonam Singh", new BigDecimal("85000"), 40));
		developersLIst.add(new Developer("Meena Yadav", new BigDecimal("75000"), 31));
		developersLIst.add(new Developer("Rajesh Singh", new BigDecimal("55000"), 25));
		developersLIst.add(new Developer("Sagar Matre", new BigDecimal("60000"), 56));
		developersLIst.add(new Developer("Shradha Gupta", new BigDecimal("950000"), 28));
		return developersLIst;
	}

}

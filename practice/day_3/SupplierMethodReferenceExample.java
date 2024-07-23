package com.java.practice.day_3;

import java.util.function.Supplier;

import com.java.practice.data.Student;

public class SupplierMethodReferenceExample {

    Supplier<Student> studentSupplier = Student::new;

    public static void main(String[] args) {

        System.out.println();

    }
}

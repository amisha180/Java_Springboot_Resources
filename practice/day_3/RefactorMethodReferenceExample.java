package com.java.practice.day_3;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.java.practice.data.Student;
import com.java.practice.data.StudentDataBase;

public class RefactorMethodReferenceExample {

    static Predicate<Student> predicateUsingLambda = (s) -> s.getGradeLevel()>=3;

    static Predicate<Student> predicateUsingMetRef = RefactorMethodReferenceExample::greaterThan;


    static BiPredicate<Student,Integer> predicateUsingMethodReference = RefactorMethodReferenceExample::greaterThan;

    static public  boolean greaterThan(Student student){

        return student.getGradeLevel() >3;
    }

   static public  boolean greaterThan(Student student,Integer grade){

        return student.getGradeLevel() >grade;
    }

    public static void main(String[] args) {

        System.out.println(predicateUsingLambda.test(StudentDataBase.studentSupplier.get()));
        System.out.println(predicateUsingMetRef.test(StudentDataBase.studentSupplier.get()));
        System.out.println(predicateUsingMethodReference.test(StudentDataBase.studentSupplier.get(),3));

    }
}

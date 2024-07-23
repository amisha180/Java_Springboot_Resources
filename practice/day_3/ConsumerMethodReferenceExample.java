package com.java.practice.day_3;

import java.util.function.Consumer;

import com.java.practice.data.Student;
import com.java.practice.data.StudentDataBase;

public class ConsumerMethodReferenceExample {

    /**
     * Class::instancemethod
     */
    static Consumer<Student>  c1= System.out::println;


    /**
     * instance::instancemethod
     */
    static Consumer<Student> c2 = (student -> student.printListOfActivities());
    static Consumer<Student> c3 = (Student::printListOfActivities);

    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
        StudentDataBase.getAllStudents().forEach(c3);
    }

}

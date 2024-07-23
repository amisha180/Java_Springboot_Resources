package com.java.practice.day_2;

import java.util.List;

public interface Multiplier {

    int multiply(List<Integer> integerList);

    default int size(List<Integer> integerList){
        System.out.println("Inside interface");
        return integerList.size();
    }

    static boolean isEmpty(List<Integer> integerList){

        return integerList!=null && integerList.size()==0;
    }
};

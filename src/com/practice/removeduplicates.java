package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeduplicates {
    public static void main(String[] args) {

        Integer[] num={1,2,3,4,5,1,1,9,6};
        Set<Integer> num2=new HashSet(Arrays.asList(num));
        System.out.println(num2);
    }
}

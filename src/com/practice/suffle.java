package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class suffle {
    public static void main(String[] args) {
        Integer[] num = { 1, 2, 3, 4, 5, 6, 7 };
        List<Integer> intList = Arrays.asList(num);
        Collections.shuffle(intList);
        System.out.println(intList);
    }
}

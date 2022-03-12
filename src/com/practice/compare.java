package com.practice;

import java.util.Arrays;

public class compare {
    public static void main(String[] args) {
        int[]num1={1,2,3,4,5};
        int[]num2={1,2,3,4,5};
        System.out.println(num1==num2);
        System.out.println(Arrays.equals(num1,num2));
    }
}

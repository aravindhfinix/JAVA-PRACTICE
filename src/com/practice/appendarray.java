package com.practice;

import java.util.Arrays;

public class appendarray {
        public static void main( String[]args ) {
            int[] numbers = { 10, 20, 30 };
            System.out.println(Arrays.toString(numbers));

            numbers = Arrays.copyOf(numbers, numbers.length + 1);
            numbers[numbers.length - 1] = 40;
            System.out.println(Arrays.toString(numbers));
        }
    }
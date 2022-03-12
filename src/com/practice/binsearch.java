package com.practice;

import java.util.Arrays;

public class binsearch {
    public static void main(String[] args) {
        int[] numbers = {1, 9, 3, 4, 2};
        Arrays.sort(numbers);
        int i;
        for (i = 0; i < numbers.length; i++) {
            System.out.println("numbers are  " + numbers[i]);

        }
        System.out.println(Arrays.toString(numbers));
        int searchnum = 9;
        int findnum = Arrays.binarySearch(numbers, searchnum);
        System.out.println("the index of search num is  " + findnum);

    }
}
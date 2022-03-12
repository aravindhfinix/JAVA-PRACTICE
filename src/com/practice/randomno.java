package com.practice;

import java.util.Random;

public class randomno {
    public static void main(String[] args) {
        int[]numbers={1,2,4,55,66,3,9,3,6,1,11};
        System.out.println("random no is; "+numbers[new Random().nextInt(numbers.length)]);
    }
}

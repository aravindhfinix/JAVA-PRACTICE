package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class printuserarray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the size");
        int n = input.nextInt();
        while (n > 20 || n <= 0) {
            System.out.println("invalid");
            n = input.nextInt();
        }
        int[] num = new int[n];
        fillarray(num);
        printarray(num);

    }
    private static void fillarray(int[] num) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <num.length; i++)
            num[i] = input.nextInt();
    }

    private static void printarray(int[] num) {
        System.out.println("enter num");
        System.out.println(Arrays.toString(num));
    }
}


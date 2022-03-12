package com.practice;

public class Addmultiaverge {
    public static void main(String[] args) {
    int[] numbers={1,2,-3,4,5};
    int sum=0;
    int product=1;
    double average;
    for(int i=0;i<numbers.length;i++) {
        sum+=numbers[i];
        product*=numbers[i];
    }
    average=(double)sum/numbers.length;
        System.out.println(" sum="+sum+" product="+product+" average="+average);
    }
}

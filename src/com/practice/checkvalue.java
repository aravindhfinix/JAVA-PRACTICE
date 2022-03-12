package com.practice;

public class checkvalue {
    public static void main(String[] args) {
        int[] num={1,23,4,5,6,7};
        int val =7;
        for(int a:num){
            if(a==val){
                System.out.println("the "+val+" is present in the array");
            }
        }
    }
}

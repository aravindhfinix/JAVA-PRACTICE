package com.practice;

public class greatestno {
    public static void main(String[] args) {
        int[] n={1,9,2,3,5,6};
        int great=n[0];
        for(int i=1;i<n.length;i++){
            great=(n[i]>great)?n[i]:great;

        }
        System.out.println("greatest no is "+great);
        }
}

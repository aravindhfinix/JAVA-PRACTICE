package com.practice;
public class Addrowcoloum {
    public static void main(String[] args) {
        int[][] numbers1 = {{2, 5, 8, 4, 3},
                {1,2,3,4,5},
                {1,2,3,2,1},
                {1,2,3,2,1}};

        for(int i=0;i<4;i++){
            int sum=0;
            for(int j=0;j<5;j++)
                sum+=numbers1[i][j];

            System.out.println("the sumof coloum " +(i+1)+" "+sum);
        }
    }}


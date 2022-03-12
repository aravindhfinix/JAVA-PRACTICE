package com.practice;

public class filter {
    public static void main(String[] args) {
        String[] letter={"acv","dvcc","ejc","er"};
        int filter_val=3;
        for(int i =0;i<letter.length;i++){
            String l2=letter[i];

            if (l2.length()>=filter_val){
                System.out.println(l2);

            }
        }
        }}
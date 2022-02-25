package com.company;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(sum (2,4));
        System.out.println(multiply (3,7));
        System.out.println(divide (25,5));
        System.out.println(difference (30,5));

    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static int multiply (int a, int b){
        return a*b;
    }

    public static int divide (int a, int b){
        return a/b;
    }
    public static int difference (int a, int b){
        return a-b;
    }


}




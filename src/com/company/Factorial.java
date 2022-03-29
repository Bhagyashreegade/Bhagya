package com.company;

public class Factorial {
    public static void main(String[] args) {
        //find the Factorial of 6

        int num = 6;
        int factorial = 1;

        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of 6 is " + "" + factorial);


        // Print first 8 numbers of the fibonacci series
        // 0,1,1,2,3,5,8,13

        int a=0;
        int b=1;
        int c;

        for (int i = 0; i <8; i++){

            System.out.print(a + " ");
            c= a+b;
            a=b;
            b=c;
        }
    }
}

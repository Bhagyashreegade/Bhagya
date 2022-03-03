package com.company;

// Comparison Operators
//a == b, a!=b, a<b, a>b, a<=b, a>=b

public class Notes_3comp_operators {

    public static void main(String[] args) {
// conditional statement
        boolean isSunup= false;
        if (isSunup== true)
        System.out.println("day");

        else
            System.out.println("night");



        int age =15;
        if(age >18)
            System.out.println("The person can vote");
        else
            System.out.println("The person cannot vote");

 // Logical Operators && , ||, !

        int a= 60;
        int b= 40;
         if (a <50 && b<50)
             System.out.println("both less than 50");
         else
             System.out.println("one of them is greater than 50");

         boolean isAdult= false; //! is used to get a true value even if data type is false
         if (!isAdult == true)
             System.out.println("is adult");
         else
             System.out.println("is not adult");













        }
























    }


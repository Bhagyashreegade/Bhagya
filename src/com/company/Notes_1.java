package com.company;

public class Notes_1 {

    public static void main(String[] args) {

// Strings are immutable
        //String name= new String();
       String name = "Aman and Akku";
        System.out.println(name.replace('A','B'));
        System.out.println(name);
        System.out.println(name.substring(0,4));
        System.out.println(name.length());
        System.out.println(name.charAt(6));
        System.out.println(name.concat(" and Appu "));

 // Arrays have two functions length & sort
        //unlike String length in Array does not need to be in paranthesis.
        // in sout statment we need to call the variable with [] brackets and not just the variable name


//        int[] marks= new int[3];
//        marks[0]= 97;
//        marks[1]= 98;
//        marks[2]= 95;
//        System.out.println(marks.length);
//
//        System.out.println(marks[0]);
//        Arrays.sort(marks);
//        System.out.println(marks[0]);

       int[] marks={ 97, 98, 95};

       //2D array
        int [][] finalMarks= {{97,98,95},{95,95,98}};
        System.out.println(finalMarks[0][0]);


        //imp topic in java-Casting
        //implicit (allowing to accomodate int value in double) or explicit (allowing to accomodate double in int value)

        int p=100;
        int fp= p+ (int)18.0; //18.99 will also give 118 as an output.
        System.out.println(fp);

        //Constants
        //to make any data type as an constant value we need to add final before it so it cannot be changed

       final float PI= 3.14F;
         //PI= 2.1F; // as it is final and hence constant

        //Operators- 4 types- Arithmetic (done), logical,operational, assignment, comparison
// Arithmetic - sum,multi,divide,difference, modulo
        double a= 1;
        double b= 2;
        double modulo= a  % b;
        System.out.println(modulo);

// Assignment - equal t0
// Unary operators ++, --

        //Math class, random function
        System.out.println(Math.min(5,10));

        System.out.println(Math.random()); //gives long value
        System.out.println((int)Math.random()); //long value gets explicitly casted into int value.
        System.out.println((int)(Math.random()*100));





































        }
    }





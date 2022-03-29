package xyz.company;
//Functions & Methods

import java.util.Scanner;

public class Chapter_7 {

    //functions are stored in a memory in form of stack.and their variables are also stored in stack

//    public static void printMyName(String name) {
//        System.out.println(name);
//        return;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        String name= sc.next();
//
//        printMyName(name); //call kiya function ko




    public static int multiplyTwoNumbers(int a, int b){
       return a*b;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Print the value of a");
        int a= sc.nextInt();
        System.out.println("Print the value of b");
        int b=sc.nextInt();

        System.out.println("Multiplication of a & b is"+ " "+ multiplyTwoNumbers(a,b));
    }

    //print factorial of numbers

    }




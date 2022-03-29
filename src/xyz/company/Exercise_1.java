package xyz.company;

import java.util.Scanner;

public class Exercise_1 {

    //Q.1 enter 3 numbers from the user and make a function to print their average

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Print first number");
//        int a = sc.nextInt();
//        System.out.println("print second number");
//        int b = sc.nextInt();
//        System.out.println("Print third number");
//        int c = sc.nextInt();
//        int avg = (a + b + c) / 3;
//        System.out.println("The average of 3 numbers is" + " " + avg);
//    }


    //Q.2 write a function to print the sum of all odd numbers from 1 to n

//    public static void printSum(int n) {
//        int sum=0;
//
//        for (int i=1; i<=n; i++){
//            if(i %2 == 1) {
//                sum =sum + i;
//            }
//
//        }
//        System.out.println(sum);
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner (System.in);
//        int n=sc.nextInt();
//        printSum(n);
//
//    }

    //Q.3 write a function which takes in 2 numbers and returns the greater of those two

//    public static int greaterNum(int a, int b) {
//
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Print number a");
//        int a = sc.nextInt();
//        System.out.println("Print number b");
//        int b = sc.nextInt();
//        System.out.println("The greater of those two number is "+" "+greaterNum(a, b));
//
//    }

    //Q.4 Write a function that takes in the radius as input and returns the circumference of a circle

//    public static Double getCircumference(Double radius) {
//        return 2* 3.14* radius;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of radius");
//        Double radius = sc.nextDouble();
//        System.out.println("The value of circumference is "+" "+getCircumference(radius));
//
//    }

    //Q.5 Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age>18 is eligible to vote.

//
//    public static boolean eligibilityToVote(int age) {
//
//        if (age > 18) {
//            return true;
//        }
//            return false;
//        }
//
//        public static void main (String[]args){
//            Scanner sc = new Scanner(System.in);
//            int age = sc.nextInt();
//            System.out.println("The result is " + eligibilityToVote(age));
//        }

    //Q.6 Write an infinite loop using do while condition

    public static void main(String[] args) {

        do {
            System.out.println("loop");
        } while (true);
    }






}




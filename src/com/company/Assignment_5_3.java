package com.company;

import java.util.Scanner;

public class Assignment_5_3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the vale of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b= sc.nextInt();
        System.out.println("Operation to be performed");
        char operation= sc.next().charAt(0);


        switch (operation){
            case '+':
                System.out.println("Addition of a & b is" + " "+ (a+b));
                break;

            case '-':
                System.out.println("Substraction of a & b is" + " " + (a-b));
                break;

            case '*':
                System.out.println("Multiplication of a & b is" + " "+ (a*b));
                break;

            case '/':
                System.out.println("Division of a & b is" + " "+ (a/b));
                break;

            default:
                System.out.println("Incorrect input");
                break;


        }
    }
}

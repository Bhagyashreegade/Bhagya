package com.company;

import java.util.Scanner;

public class Assignment_5_2 {
    public static void main(String[] args) {

        //Q1. Guess the number

        Scanner sc= new Scanner(System.in);
        System.out.println(" I have Guessed a number (1-100)");
        int computerNum= (int) ((Math.random())*100);
        System.out.println(computerNum);
        System.out.println("Guess my number : ");
        while (true) {
            int userInput= sc.nextInt();
            if (userInput  == computerNum){
                System.out.println(" Well done, the guess was right");
                break;
            } else if (userInput < computerNum){
                System.out.println("Better luck next time, the guess number is less than computerNum");
            } else {
                System.out.println("Better luck next time, the guess is greater than computerNum");
            }

        }


    }
}

package com.company;
//import java.util.*;


public class Patterns {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//       System.out.println("Type a number n");
//       int n= sc.nextInt ();

//print even  numbers

//        for (int i=1; i<=n; i++){
//            if (i %2==0){
//                System.out.println(i);
//            }
        // Q.1 print the rectangle of stars
        //Hint: outer loop represent rows while inner loops represent columns

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Q.2 print the hollow rectangle of stars

        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= 5; l++) {
                if (k == 1 || k == 5 || l == 1 || l == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // Q.3 print half pyramid

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


        // Q.4 Print reverse half pyramid

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Q.5 Print inverted half pyramid (rotated by 180 deg)


        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {  //inner loop for space print
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {   //inner loop for star print
                System.out.print("*");
            }
            System.out.println();
        }


        //Q.6 print the pyramid pattern with number 1 to 5

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        //Q.7 Print the inverted half pyramid with numbers 1to 5

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}














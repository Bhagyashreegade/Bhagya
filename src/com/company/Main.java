package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("CHANGES MADE BY AMONJOT");
        //find the sum of 1-10

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                sum = sum + i;
        }
        System.out.println(sum);

        // find the product of 1- 10
        int product = 1;
        for (int i = 1; i <= 10; i++) {
            product = product * i;
        }
        System.out.println(product);


        // double for loop
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("hello");
            }
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + "\t"); // tab space
            }
            System.out.print("\n"); // empty line or line break
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + "\t");
            }
            System.out.print("\n");
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }
            System.out.print("\n");
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.print("\n");

        }

        //while loop at the entry
        int j = 1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        // do while loop at the exit
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);


        // infinite loop
        while (true) {
            System.out.println("hello");
        }


    }
}




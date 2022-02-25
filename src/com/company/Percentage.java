package com.company;

import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter S1 marks");
        int S1 = sc.nextInt();
        System.out.println("Enter S2 marks");
        int S2 = sc.nextInt();
        System.out.println("Enter S3 marks");
        int S3 = sc.nextInt();
        System.out.println("Enter S4 marks");
        int S4 = sc.nextInt();
        System.out.println("Enter S5 marks");
        int S5 = sc.nextInt();

        int totalMarks = S1 + S2 + S3 + S4 + S5;
        int totalOf = 250;
        int i = (totalMarks * 100 / totalOf);
        System.out.println("You got" + " " + i + " % ");

        if (i > 80) {
            System.out.println("A Grade");
        }
        if (i >= 70 && i <= 80) {
            System.out.println("B Grade");
        }
        if (i >= 60 && i < 70) {
            System.out.println("C Grade");
        }
        if (i < 60) {
            System.out.println("D Grade");
        }

    }
}

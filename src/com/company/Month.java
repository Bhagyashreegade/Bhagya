//Take input of Month # from user accordingly print 30/31/28 days
package com.company;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        System.out.println("Please enter month number (1-12)");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        }

        if (month == 2) {
            System.out.println("28 days");
        }
    }
}
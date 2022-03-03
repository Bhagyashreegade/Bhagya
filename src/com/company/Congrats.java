//Take input from user.If that number is between 1 to 100, print congrats.

package com.company;

import java.util.Scanner;

public class Congrats {
    public static void main(String[] args) {
        System.out.println("number is between 1 to 100");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       // if (num >1 && num<100) {
            //System.out.println("Congrats");
        //}

        if (num >1 || num<100) {
            System.out.println("Congrats");
        }
    }
}

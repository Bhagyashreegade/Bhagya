// Take 3 nos from user check if all of them are equal print "the nos are equal"

package com.company;

import java.util.Scanner;

public class Assignment_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter b number");
        int b= sc.nextInt();
        System.out.println("Enter c number");
        int c= sc.nextInt();


        if (a==b && b==c){
            System.out.println("The numbers are equal");
        }

    }
}

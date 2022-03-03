package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_26 {

    //given String s, index i, index j, create function to swap character present at index i and index j.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("String Name" + " " + "is");
        String s = sc.next();
        System.out.println("Index i");
        int i = sc.nextInt();
        System.out.println("Index j");
        int j = sc.nextInt();
        swapcharatIndex (s, i , j);
    }
    public static void swapcharatIndex (String s, int i, int j) {

        char[] swap = s.toCharArray();
        System.out.println("String before Swap"+ Arrays.toString(swap));
        char z;
        z = swap[i];
        swap[i] = swap[j];
        swap[j] = z;
        System.out.println("String after Swap"+ Arrays.toString(swap));

    }
}



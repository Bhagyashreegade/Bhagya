package com.company;

import java.util.Scanner;

public class Conditional_Statement {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        //if, else if, else

        System.out.println("How much cash you have");
        int cash= sc.nextInt();
        if (cash <10){
            System.out.println("cannot buy anything");
        }
        else if (cash >10 && cash <50){
            System.out.println("can get one thing");
        }

        else{
            System.out.println("can get both");
        }

        //SWITCH take one value and check multiple conditions

        int day=1;

        switch (day){
            case 1:
                System.out.println("monday");

            case 2:
                System.out.println("Tuesday");

            default:
                    System.out.println("Wed-Sun");

        }








    }
}

package com.company;

import java.util.Scanner;

public class Notes_conditional_Statement {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

//        //if, else if, else

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

//        //SWITCH take one value and check multiple conditions
//
        int day=1;

        switch (day) {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Wed-Sun");
        }

//        //LOOPS- 3type for loops, do-while loops, while loops
//          //print no 100-1
//
           for (int i= 100; i>=1; i--){
               System.out.println(i);
           }
//
//           //While lOOP
           int i=100;
           while(i>=1){
               System.out.println(i);
               i--;
           }
//           //Do while loop
           int j= 100;
           do {
               System.out.println(j);
               j--;
           }while (j >=1);

           // example for do while
        int num= 0;
        do{
            System.out.println("input a number");
            num= sc.nextInt();
            System.out.print("here is you number:  ");
            System.out.println(num);
        } while(num>=0);

        System.out.println("THE END");


    // example to skip the number in between the loop while using continue & break
         int k=0;
         while(true) {
            if (k == 3) {
                k++;
                continue;
            }
            System.out.println(i);
            k++;
            if (k > 5) {
                break;
            }





        }
    }
}

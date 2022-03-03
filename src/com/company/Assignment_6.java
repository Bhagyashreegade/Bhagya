package com.company;

public class Assignment_6 {

    public static void main(String[] args) {
        // Declare an array to hold 10 decimal values and calculate sum of this values.-double nums [10]

         double nums []= {1.4,2.5, 2.5, 3.6, 3.9,4.2,4.8,4.0, 3.1, 2.3};
         double sum=0;
        System.out.println("Sum of the value is: ");
         for (double i=0; i<nums.length; i++)
         {
             sum= sum + nums[(int) i];
         }
        System.out.print(sum);

        {
            System.out.println();
        }

        // declare an array of char and store your first name.
        
        char [] Firstname= {'B', 'h', 'a', 'g', 'y', 'a'};
        for (char c: Firstname){
            System.out.print(c);
        }
    }
}

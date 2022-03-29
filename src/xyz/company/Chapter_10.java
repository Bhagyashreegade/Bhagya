package xyz.company;

import java.util.Scanner;

public class Chapter_10 {

    public static void main(String[] args) {
        //defining array in two ways

        //first way
//        int[]marks= new int[3];
//        marks[0]=97;
//        marks[1]=98;
//        marks[2]=95;

        //second way
//       int[]marks= {97, 98, 95};
//      for (int i=0; i<3; i++){
//          System.out.println(marks[i]);
//      }


       Scanner sc= new Scanner (System.in);
       int size=sc.nextInt();
       int[]numbers= new int [size];

         // filling an array
       for (int i=0; i<size; i++){
           numbers[i]=sc.nextInt();
       }

       int x= sc.nextInt();

       //output of an array

       for (int i=0; i<size; i++){
           System.out.println(numbers[i]);

       }







          }
    }


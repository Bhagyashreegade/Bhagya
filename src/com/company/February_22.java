package com.company;

public class February_22 {

    public static void main(String[] args) {
        //array is the collection of continues memory, it is complex data type , it is an Object.


        //int array will store only numbers.
       // marks[] is the reference variable

        int marks[]= new int[10];
//        marks[0] = 100; // address for the first block = 1000
//        marks[5] = 500; // 1000+5
       // System.out.println(marks[0]);

        for (int i= 0; i<9; i++){
            marks[i]=9;
        }
//        for (int i=0; i<5; i++){
//            System.out.println(marks[i]);
        //}

       int s=0;
        for (int i=0; i<9; i++){
            s = s+ marks[i];
        }
        System.out.println(s);

        //find out the length of array

        marks = new int[6];
        System.out.println("length=" +marks.length);
    }
}

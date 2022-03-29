package com.company;

public class Assignment_6 {

    public static void main(String[] args) {
        // Declare an array to hold 10 decimal values and calculate sum of this values.-double nums [10]

        double nums[] = {1.4, 2.5, 2.5, 3.6, 3.9, 4.2, 4.8, 4.0, 3.1, 2.3};
        double sum = 0;
        System.out.println("Sum of the value is: ");
        for (double i = 0; i < nums.length; i++) {
            sum = sum + nums[(int) i];
        }
        System.out.print(sum);

        {
            System.out.println();
        }

        // declare an array of char and store your first name.

        char[] Firstname = {'B', 'h', 'a', 'g', 'y', 'a'};
        for (char c : Firstname) {
            System.out.print(c);
        }
        System.out.println("\t");


        // declare a 2D array of 5 by 3, find average of each column

        int[][] elements = new int[][]{
                {1, 2, 3},
                {2, 6, 7},
                {3, 8, 9},
                {4, 10, 11},
                {5, 4, 10}
        };


        for (int i = 0; i < 3; i++) {
            int sum1 = 0;
            int avg;
            for (int j = 0; j < 5; j++) {
                sum1 = sum1 + elements[j][i];
            }
            avg = sum1 / 5;
            System.out.print(avg + " ");
        }


        System.out.println();


        //print the hollow rectangle for 5X3 2D array

        int[][] arr = new int[][]{
                {1, 2, 3},
                {2, 6, 7},
                {3, 8, 9},
                {4, 10, 11},
                {5, 4, 10}
        };

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 2) {
                    System.out.print(arr[i][j] + "  ");
                } else {
                    System.out.print("   ");

                }
            }
            System.out.println();

        }

    }
}


package com.company;

public class TwoD_array {

    public static void main(String[] args) {
        //2D array is array of array

        int arr[][] = new int[][]{

                {1, 2, 3, 7}, //1 row
                {3, 5, 5, 8},//2 row
                {6, 5, 4, 7} //3 row
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();

        }
    }
}

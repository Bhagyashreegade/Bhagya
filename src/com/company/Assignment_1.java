package com.company;
//if the number is decimal put f after the number is defined in sout statement
//done it with both way directly consumed in sout and taken control of using .var


public class Assignment_1 {
    public static void main(String[] args) {
        System.out.println(square(4));
        int square = square(4);

        System.out.println(areaOfRectangle(3, 3));
        float areaOfRectangle = areaOfRectangle(3, 3);

        System.out.println(Circle(3.14f, 4));
        float circle = Circle(3.14f, 4);

        System.out.println(printFullName("Bhagya", "Gade"));
        String fullName = printFullName("Bhagya", "Gade");

        System.out.println(SumofThree(1, 1, 1));
        int three = SumofThree(1, 1, 1);

    }

    public static int square(int a) {
        return a * a;
    }

    public static float areaOfRectangle(float length, float breadth) {
        return length * breadth;
    }

    public static float Circle(float pi, int r) {
        return pi * r * r;
    }

    public static String printFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static int SumofThree(int a, int b, int c) {
        return a + b + c;
    }

}





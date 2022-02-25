package com.company;

public class Assignment_2 {
    public static void main(String[] args) {
        square(2);
        areaOfRectangle(3, 3);
        Circle(3.14f, 4);
        printFullName("Bhagya", "Gade");
        SumofThree(1, 1, 1);
    }
    public static void square(int a) {
        System.out.println("the square of number"+" "+a+" "+(a*a));
    }
    public static void areaOfRectangle (float length,float breadth){
        System.out.println("the area of rectangle"+ "  " + (length*breadth));
    }
    public static void Circle (float pi, int r) {
        System.out.println("the circle of area" + " " + "is" + " " + (pi * r * r));
    }
    public static void printFullName (String firstName, String lastName){
        System.out.println("the fullName"+ " "+ "is" + " "+ firstName+ lastName);

    }
    public static void SumofThree (int a, int b, int c){
        System.out.println("addition of Three"+ " "  +"is"+" "+ (a+b+c));
    }
































































}

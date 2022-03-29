package xyz.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print number a ");
        int a = sc.nextInt();
        System.out.println("print number b");
        int b = sc.nextInt();
        System.out.println("Operation to be performed");
        char operation = sc.next().charAt(0);

        switch (operation) {

            case '+':
                System.out.println((a + b));
                break;
            case '-':
                System.out.println((a - b));
                break;
            case '*':
                System.out.println((a * b));
                break;
            case '/':
                System.out.println((a / b));
                break;
            case '%':
                System.out.println((a % b));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}






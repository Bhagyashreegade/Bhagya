package xyz.company;

import bank.Account;
import bank.Bank;

class Shape {
    String color;
    public void area(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

public class Inheritance {
    public static void main(String[] args) {

        bank.Account account1= new bank.Account();
        account1.name= "Bhagya";

        bank.Bank b1= new bank.Bank();
        b1.accountNumber= "123";

//        Triangle t1=new Triangle();
//        t1.color= "Orange";


    }
}

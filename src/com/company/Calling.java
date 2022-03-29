package com.company;

  class Employee {
    public static String companyName = "XYZ";
    int id;
    String name;
    String address;

    public static void callCompanyName() {
        System.out.println("I work for XYZ");
    }

      public int getId() {
          return id;
      }
  }


public class Calling {
    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.id= 123;
        System.out.println(e1.getId());
        //Employee.callCompanyName();

    }
}
     
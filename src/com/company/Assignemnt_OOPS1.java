package com.company;

class Person {
    String firstName;
    String lastName;
    String address;
    int age;

    public String getFullName() {
        return firstName + lastName;
    }

    public Person() {
        this.firstName = "Bhagya";
        this.lastName = "Gade";
        this.address = "Kitchener";
        this.age = 31;
    }

    public void changeAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

 class Family {

     String FatherName;
     String MotherName;
     String SonName;
     String DaughterName;
     int FatherSalary;
     int MotherSalary;
     int SonFee;
     int DaughterFee;
     int Grocery = 500;

     public Family(String FatherName, String MotherName, String SonName, String DaughterName, int FatherSalary, int MotherSalary, int SonFee, int DaughterFee) {
         System.out.println("Parameterized constructor");
         this.FatherName = FatherName;
         this.DaughterName = DaughterName;
         this.MotherName = MotherName;
         this.SonName = SonName;
         this.FatherSalary = FatherSalary;
         this.MotherSalary = MotherSalary;
         this.SonFee = SonFee;
         this.DaughterFee = DaughterFee;
     }

     public void displayNames() {
         System.out.println("Name of Father is" + FatherName);
         System.out.println("Name of Mother is" + MotherName);
         System.out.println("Name of Son is" + SonName);
         System.out.println("Name of Daughter is " + DaughterName);
     }

     public int getTotalSalary() {
         return FatherSalary + MotherSalary;
     }

     public int getTotalFee() {
         return SonFee + DaughterFee;
     }

     public int getSavings() {
       return (FatherSalary+MotherSalary-SonFee-DaughterFee-Grocery);
     }

     public void checkSavings() {
         int savings = getSavings();
         if (savings > 1000) {
             System.out.println("Congratulations" + FatherName + savings);
         }
     }

public void calculateBMI (float weight, float height){

    System.out.println(weight);
    System.out.println(height);
    System.out.println(weight/ (height * height));

     }
 }

 class EvenArray{

    int[]arr= {3,2,8,1,4,7};
    public int countEvenNumbers (){
        int count =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]%2==0)count ++;
        }
        return count;

    }
 }







































package Udemy;

import java.util.ArrayList;

public class SelIntroduction {

    public static void main (String[] args){

        int [] arr= {1,2,4,5,6,9,10,122};
        for (int i=0; i<arr.length; i++){

            if(arr[i]%2 ==0){  //to print even  numbers
                System.out.println(arr[i]);
            }
            else{
                System.out.println(arr[i]  +" "+ "is not multiple of 2");
            }
        }

        ArrayList<String> a = new ArrayList<String>(); //dynamically add data
        a.add ("Rohan");
        a.add ("Parikh");
        a.add ("Bhagyashree");
        System.out.println(a.get(1)); //extract the values form the Array list

        String s1= "Bhagya GAde";
        String s2= "Bhagya GAde"; //String literal

        String s3= new String ("Welcome");  // String new
        String s4= new String ("Welcome");

        String s= "Rohan Parikh";
        String []splittedString =s.split(" ");
        System.out.println(splittedString[0]);
        System.out.println(splittedString[1]);

        for (int i=0; i<s.length(); i++){    // print all characters in String
            System.out.println(s.charAt(i));
        }
        //Reverse a String(very imp  question)

        for (int i= s.length()-1; i>=0; i--){
            System.out.println(s.charAt(i));
        }

        System.out.println("Bitbucket practice");
        System.out.println("step 1 Changes");



    }
}

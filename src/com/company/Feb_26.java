package com.company;

// substring, index of, CharAt, replace (for all occurrence) , replaceFirst (only first character) are instance method
// String.valueof () is a static method as it is used directly with the object String.
// integer.parseInt will return int data-type (primitive) whereas Integer.value of will return Integer data-type(wrapper)

public class Feb_26 {
    public static void main(String[] args) {

        //int k= 12345;
        int anInt = Integer.parseInt("125");
        System.out.println(anInt);

        String name = "Bhagya";
        //System.out.println(name);
        char[] chars = name.toCharArray();
        char[] reverseArr = new char[name.length()];

        int length = chars.length;
        for (int i = 0; i < length; i++) {
            reverseArr[length - i - 1] = chars[i];
        }

        String reverse = new String(reverseArr);
        System.out.println(reverseArr);


        if (name.equalsIgnoreCase(reverse)) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }


    }
    }


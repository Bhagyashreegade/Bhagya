package xyz.company;

public class Array_practice {

    public static void main(String[] args) {
        double []decimalNum= {1.4,2.5, 2.5, 3.6, 3.9,4.2,4.8,4.0, 3.1, 2.3};
        double s=0;
        for (double i=0; i< decimalNum.length; i++){
            s= s+ decimalNum[(int) i];
        }
        System.out.println(s);


        char[] firstName = {'B', 'H', 'A', 'G', 'Y', 'A'};
        for (char c: firstName) {
            System.out.print(c);
        }

        }
    }


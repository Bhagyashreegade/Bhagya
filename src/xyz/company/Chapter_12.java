package xyz.company;

public class Chapter_12 {
    public static void main(String[] args) {

        String firstName= "Bhagya";
        String lastName= "Gade";
        String fullName= firstName+ " " +lastName;
        System.out.println(fullName.length());

        //charAt
        for (int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //compareTo

        String s1= "Bhagya";
        String s2="Bhagya";
        if (s1.compareTo(s2)==0){
            System.out.println("Strings are equal");
        }else if (s1.compareTo(s2)>0){
            System.out.println("s1 is greater than s2");
        } else{
            System.out.println("s2 is greater than s1");
        }


      //substring

        String sentence= "Bhagya Gade";
        String name= sentence.substring(0, 6);
        System.out.println(name);

        //parseInt
        String str= "123";
        int num= Integer.parseInt(str);
        System.out.println(num);

        //toString

        int number= 123;
        String strr= Integer.toString(number);
        System.out.println(strr.length());


    }
}

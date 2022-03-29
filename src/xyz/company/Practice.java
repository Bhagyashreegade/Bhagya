package xyz.company;

import java.util.Arrays;

public class Practice {

    //count a in given String

    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent gravida nibh sed dolor facilisis tincidunt. Nulla ut eros at magna consequat sagittis. Sed mollis odio nec lorem pretium, ut porttitor justo condimentum. Quisque feugiat gravida justo, sed laoreet nulla cursus at. Vestibulum at nunc enim. Aliquam erat volutpat. Ut dapibus elit purus, quis facilisis nulla porttitor vitae. Proin sollicitudin auctor nisl at ullamcorper. Praesent gravida porttitor dui, et malesuada est varius id. Nulla nec diam enim. Vestibulum imperdiet leo sodales nunc imperdiet, sed imperdiet diam gravida. Integer tincidunt sagittis mi, quis vestibulum est pulvinar ut. Aenean fringilla, dolor eget varius sagittis, ex elit molestie risus, vitae iaculis massa elit vitae magna. Quisque quis convallis purus. Phasellus vitae tempor sapien, vestibulum commodo odio.";
        int charCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                charCount++;

            }
        }
        System.out.println("count of character 'a' on String: " + charCount);

        String[] names = new String[10];
        names[1] = "Bhagyashree";
        names[2] = "Geetha";
        names[3] = "Darpan";
        names[4] = "Amonjot";
        names[5] = "Harpreet";
        names[6] = "Gaurav";
        names[7] = "Prince";
        names[8] = "Harry";
        names[9] = "Deepika";

        System.out.println(Arrays.binarySearch(names, "John Doe"));

        String name = "Bhagya";
        char[] chars = name.toCharArray();
        char[] reverseArr = new char[name.length()];

        int length = chars.length;
        for (int i = 0; i < length; i++) {
            reverseArr[length - i - 1] = chars[i];
        }
        String reverse = new String(reverseArr);
        System.out.println(reverseArr);
        


        //
    }
}

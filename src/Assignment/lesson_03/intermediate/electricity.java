package Assignment.lesson_03.intermediate;

import java.util.Scanner;

public class electricity {
    public static void main(String[] args) {

        int ans=1;

        Scanner input=new Scanner(System.in);
        int value=input.nextInt();
        System.out.println(func(value));
    }

    public static int func( int value) {
        if (value < 100) {
            return value * 3;
        } else if (value > 100 & value < 300) {
            return value * 5;
        } else {
            return value *7;
        }
    }
}

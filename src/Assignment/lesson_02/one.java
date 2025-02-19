package Assignment.lesson_02;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number:");
        int value=input.nextInt();
        String ans=number(value);
        System.out.println(ans);
    }

    static String number(int value){
        if(value%2==0){
            return "It is an even number";
        }
        else{
            return "it is an odd number";
        }
    }


}
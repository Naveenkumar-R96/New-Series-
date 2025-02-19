package Assignment.lesson_02;

import java.util.Scanner;

public class two {
    public static void main(String[] args){
        //Take name as input and print a greeting message for that particular name

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name :");
        String value=input.nextLine();
        String ans=func(value);
        System.out.println(ans);


    }
    static String func(String value){
        String cv="Welcome Back"+ value;
        return cv;
    }
}

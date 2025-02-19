package Assignment.lesson_02;

import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount:");
        double principal = input.nextDouble();
        System.out.print("Enter the time amount:");
        double time = input.nextDouble();
        System.out.print("Enter the rate amount:");
        double rate = input.nextDouble();

        double ans=func(principal,time,rate);
        System.out.println("The Interest is:");
        System.out.println(ans);


    }
    static double func(double value1, double value2 ,double value3 ){
        double value=value1*value2*value3/100;
        return value;
    }
}

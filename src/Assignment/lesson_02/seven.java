package Assignment.lesson_02;

import java.util.Scanner;

public class seven {
    public static void main(String[] args){
        //program to find the fibonacci series upto n numbers

        System.out.print("Enter the number:");
        int first=0;
        int second=1;


        Scanner input=new Scanner(System.in);
        int num=input.nextInt();


        for(int i=0; i<=num; i++){
            System.out.println(first+" ");
            int third=first+second;
            first=second;
            second=third;
        }
    }
}

package Assignment.lesson_03;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class twentythree {
    public static void main(String[] args) {
        //program to find the factorial of the given number;
        Scanner input=new Scanner (System.in);
        System.out.print("Enter the number for the factorial:");
        int value=input.nextInt();
        System.out.print("The number are: " );

        for (int i=1; i<=value;i++){
            if(value%i==0){
                System.out.print(i + " ,");
            }
        }


    }
}

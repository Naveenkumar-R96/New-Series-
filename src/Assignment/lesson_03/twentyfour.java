package Assignment.lesson_03;

import java.util.Scanner;

public class twentyfour {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the sum of all numbers (HINT:

        int sum=0;

        Scanner input=new Scanner(System.in);

        while(true){
            System.out.println("Enter the value: ");
            int value=input.nextInt();
            sum=sum+value;

            if(value==0){
                break;
            }

        }
        System.out.println(sum);
    }
}

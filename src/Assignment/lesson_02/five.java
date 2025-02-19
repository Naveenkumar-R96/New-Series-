package Assignment.lesson_02;

import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        //Take 2 numbers as input and print the largest number.
        Scanner input =new Scanner(System.in);

        System.out.print("Enter value one: ");
        int input1=input.nextInt();
        System.out.print("Enter vale two: ");
        int input2=input.nextInt();

        int ans =func(input1,input2);
        System.out.println("The greatest number is : " +ans);

    }
    static int func(int value1, int value2){
        if (value1>value2){
            return value1;
        }
        else {
            return value2;
        }
    }
}

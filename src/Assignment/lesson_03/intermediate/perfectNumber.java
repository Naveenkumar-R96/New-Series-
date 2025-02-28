package Assignment.lesson_03.intermediate;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the number:");
        int value=input.nextInt();
        if(func(value)){
            System.out.println("its an perfect number");
        }
        else{
            System.out.println("isnt a perfect number");
        }

    }
    public static boolean func(int value){
        int sum=0;
        for(int i=1; i<=value/2;i++){
            if(value%i==0){
                sum+=i;
            }
        }
        return sum==value;
    }
}


package Assignment.lesson_03.intermediate;

import java.util.Scanner;

public class cgpa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        System.out.print("Enter the number of subjects:");
        int value=input.nextInt();
        double total=0;
        int divide=0;

        for (int i=1; i<=value; i++){
            System.out.print("Enter the credit:");
            int grade =input.nextInt();
            System.out.print("Enter the grade:");

            int credit=input.nextInt();
            divide=divide+credit;
            int ans=grade*credit;
            total=total+ans;

        }
        double cgpa=total/divide;
        System.out.println("your cgpa is:" +cgpa);
    }
}

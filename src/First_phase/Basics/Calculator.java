package First_phase.Basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int ans=0;

        while (true){
            System.out.println("Enter the operation:");

            char op=in.next().trim().charAt(0);

            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.print("Enter two numbers");

                int num1=in.nextInt();
                int num2=in.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }if(op=='-'){
                    ans=num1-num2;
                }

                System.out.println(ans);
            } else if (op=='x' || op=='X') {
                break;
            }
            else {
                System.out.println("Invalid statement");
            }



        }
    }
}

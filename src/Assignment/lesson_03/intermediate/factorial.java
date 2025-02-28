package Assignment.lesson_03.intermediate;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        //program to find the factorial
        Scanner input=new Scanner(System.in);
        int value=input.nextInt();

        int ans=1;
        while(value>0){
            ans =ans*value;
            value--;
        }
        System.out.println(ans);
    }
}

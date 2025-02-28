package Assignment.lesson_03.intermediate;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of value:");
        int value=input.nextInt();
        int ans=1;
        for (int i=1; i<=value; i++){
            System.out.println("Enter the value");
            int nextValue=input.nextInt();
            ans=ans+nextValue;
        }
        System.out.println(ans);
    }
}

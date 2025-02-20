package Assignment.lesson_02;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        //program to find the palindrom or not;


        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Word:");
        String value=input.next().trim();


        if(func(value)){
            System.out.println("The given word is Palindrome");
        }
        else{
            System.out.println("The given word is not Panlindrome");
        }

    }
    static boolean func(String value){
        value=value.toLowerCase();
        int left=0,right=value.length()-1;
        while(left<right) {
            if (value.charAt(left) != value.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
            return true;
        }

}

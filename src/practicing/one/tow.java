package practicing.one;

import java.util.Scanner;

public class tow {
    public static void main(String[] args) {
        //program to find the word palindrome or not;;

        Scanner in=new Scanner(System.in);
        System.out.print("Enter the word to check palindrome or not:");
        String word=in.next();

        boolean ans=palindrome(word);
        System.out.println(ans);
    }
    static boolean palindrome(String word){
        int total=word.length();
        int left=0;
        int right=word.length()-1;
        if(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}

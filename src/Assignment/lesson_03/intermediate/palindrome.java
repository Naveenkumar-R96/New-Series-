package Assignment.lesson_03.intermediate;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = input.nextInt();

        if (isPalindrome(value)) {
            System.out.println(value + " is a palindrome.");
        } else {
            System.out.println(value + " is not a palindrome.");
        }

        input.close();
    }

    public static boolean isPalindrome(int value) {
        String str = String.valueOf(value); // Convert integer to string
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // It's a palindrome
    }
}


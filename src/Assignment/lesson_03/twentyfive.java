package Assignment.lesson_03;

import java.util.Scanner;

public class twentyfive {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);


       int largest=0;

       while(true){
           System.out.println("Enter the number:");
           int value=input.nextInt();

           if (value>largest){
               largest=value;
           }
           if(value==0){
               break;
           }
       }
        System.out.println("Largest number is: " + largest);
    }
}
/*
* import java.util.Scanner;

public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0; // Initialize largest with 0 (since 0 ends input)

        System.out.print("Enter a number (0 to stop): ");
        int num = scanner.nextInt(); // Read the first input

        if (num == 0) {  // If the first input is 0, handle separately
            System.out.println("No numbers were entered.");
        } else {
            largest = num; // Set first valid number as the initial largest

            while (num != 0) { // Continue taking input until 0 is entered
                if (num > largest) { // Update largest if new number is greater
                    largest = num;
                }
                System.out.print("Enter a number (0 to stop): ");
                num = scanner.nextInt(); // Read the next input
            }
            System.out.println("Largest Number: " + largest);
        }

        scanner.close(); // Close scanner
    }
}

* */
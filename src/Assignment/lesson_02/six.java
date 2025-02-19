package Assignment.lesson_02;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        System.out.print("Enter the Indian Rupee (INR): ");
        Scanner input = new Scanner(System.in);

        double inr = input.nextDouble();
        input.close(); // Close scanner to prevent resource leak

        double usd = convertToUSD(inr);
        System.out.print("The equivalent USD is: "+usd + " dollars"); // Display result with 2 decimal places
    }

    static double convertToUSD(double inr) {
        double exchangeRate = 86.99; // Example rate (adjust as needed)
        return inr / exchangeRate; // Correct conversion formula
    }
}

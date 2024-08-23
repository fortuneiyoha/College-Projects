import java.util.Scanner;

public class NumInterpolation {

    public static void main(String[] args) {
        /*
         * A program that accepts three(3) inputs
         * from a user, subtracts the first input
         * from the third, then add it to the
         * second input.
         */

        // Instantiate a scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        double num1, num2, num3, result;

        // Ask for numbers and initialize variables
        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("\nEnter second number: ");
        num2 = input.nextDouble();

        System.out.print("\nEnter third number: ");
        num3 = input.nextDouble();
        input.close();

        // Evaluate and append to result
        result = (num3 - num1) + num2;

        // Display result
        System.out.printf("\nResult of (%d - %d) + %d = %d", num3, num1, num2, result);
        // System.out.print("\nResult of (" + num3 + " - " + num1 + ") + " + num2 + " =
        // " + result);
    }

}
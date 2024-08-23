import java.util.Scanner;

public class Calculator {
    static Scanner input;

    public static void main(String[] args) {
        // Instantiate a scanner class
        input = new Scanner(System.in);

        // Add a line break
        System.out.println("\n");

        // Display information about calculator
        System.out.println("Calculator V1.0.0");
        System.out.println("A simple [+, -, *, /] calculator for two numbers.");

        // Ask for first number
        System.out.print("\nEnter first number: ");
        double num1 = input.nextDouble();

        // Ask for operator symbol
        System.out.print("\nEnter an operator [+, -, *, /]: ");
        String operator = input.next();

        // Ask for second number
        System.out.print("\nEnter second number: ");
        double num2 = input.nextDouble();

        // Add a line break
        System.out.println();

        /*
         * 1. Validate user preferred operation
         * 2. Evaluate expression
         * 3. Display result of evaluation
         */
        if (operator.equals("+")) {
            System.out.println("Result of " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("Result of " + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("Result of " + num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println(num1 + " cannot be divided by 0");
            } else {
                System.out.println("Result of " + num1 + " / " + num2 + " = " + (num1 / num2));
            }
        } else {
            System.out.println("Cannot evaluate expression");
        }
    }
}

import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println("Circle Area Calculator V1.0.0");

        // Instantiate a scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables and initialize pi
        double pi = 3.1416, radius, area;

        // Ask for radius value
        System.out.print("\nEnter radius value: ");
        radius = input.nextDouble();
        input.close();

        // Evaluate and append result to area
        area = pi * Math.pow(radius, 2);

        // Display result
        System.out.print("\nArea of circle of radius " + radius + " is: " + area);
    }

}
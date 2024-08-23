public class CircleAreaCalculator {

    public static void main(String[] args) {
        System.out.println("Circle Area Calculator V1.0.0");

        // Declare variables
        double pi, radius, area;

        // Initialize variables
        pi = 3.1416;
        radius = 15;

        // Evaluate and append result to area
        area = pi * Math.pow(radius, 2);

        // Display result
        System.out.print("\nArea of circle of radius " + radius + " is: " + area);
    }

}
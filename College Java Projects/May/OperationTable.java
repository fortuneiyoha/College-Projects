import java.util.Scanner;

public class OperationTable {
    static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        System.out.println(
                "\n\nOperation Table Generator V1.0.0" +
                        "\nSelect an operation:\n" +
                        "1. Addition\n" +
                        "2. Multiplication\n" +
                        "3. Division\n");

        // Asks for user option
        int option = input.nextInt();

        // Checks if user option is valid
        if (option == 1 || option == 2 || option == 3) {
            // Asks for user preferred number
            System.out.print("\nEnter a number to create the table: ");
            int num = input.nextInt();

            // Display user option and number for table generation.
            System.out.printf("\nTable for Option: %d, Number: %d\n", option, num);

            // Loop used for generating the table
            for (int i = 1; i <= 12; i++) {
                if (option == 1) {
                    System.out.printf("%d + %d = %d \n", num, i, (num + i));
                } else if (option == 2) {
                    System.out.printf("%d * %d = %d \n", num, i, (num * i));
                } else if (option == 3) {
                    System.out.printf("%d / %d = %d \n", i, num, (i / num));
                }
            }
        } else {
            System.out.printf("Option %d is not valid", option);
        }
    }
}
import java.util.Scanner;

public class User {
    static Scanner input;

    public static void main(String[] args) {
        System.out.println("A program to display a user bio.");

        // Instantiate a scanner object
        input = new Scanner(System.in);

        // Ask for user name
        System.out.print("\nEnter your name: ");
        String name = input.nextLine();

        // Ask for user bio
        System.out.print("\nEnter your bio: ");
        String bio = input.nextLine();

        // Display user name with bio
        System.out.printf("\n\nA user named %s bio: %s.", name, bio);
    }

}
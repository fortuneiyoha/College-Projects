import java.util.Scanner; //  Importing te scanner class

public class TypeCasting {
    static Scanner input;

    public static void main(String[] args) {
        // Instantiating a scanner object
        input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("\nEnter your department: ");
        String department = input.nextLine();

        System.out.print("Student name is: " + name + ", \nstudent department is: " + department);

        /*
         * int x = 5;
         * int y = 6;
         */

        // Implicit
        // double y = x;
        // Explicit
        // double y = (int)x;

        // System.out.println("Answer is: " + (x + y));
    }

}
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer to find all prime numbers up to it: ");
        int number = scanner.nextInt();

        // Validate input
        if (number < 2) {
            System.out.println("There are no prime numbers less than 2.");
            return;
        }

        // Print prime numbers up to the given number
        System.out.println("Prime numbers up to " + number + " are:");
        printPrimeNumbers(number);
    }

    // Method to print all prime numbers up to a given number
    public static void printPrimeNumbers(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Move to the next line after printing primes
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
 * user@DESKTOP MINGW64 ~/Desktop/Projects/Java Projects
 * $ java PrimeNumbers.java
 * Enter an integer to find all prime numbers up to it: 13
 * Prime numbers up to 13 are:
 * 2 3 5 7 11 13
 */
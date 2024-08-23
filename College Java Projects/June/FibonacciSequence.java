public class FibonacciSequence {

    // Recursive method to calculate Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-recursive (iterative) method to calculate Fibonacci number
    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int fib1 = 0, fib2 = 1;
        for (int i = 2; i <= n; i++) {
            int fibNext = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibNext;
        }
        return fib2;
    }

    public static void main(String[] args) {
        int n = 8; // Example value, can be changed to any non-negative integer

        // Calculate Fibonacci using recursive method
        int fibRecursive = fibonacciRecursive(n);
        System.out.println("Fibonacci number at position " + n + " (recursive): " + fibRecursive);

        // Calculate Fibonacci using non-recursive method
        int fibIterative = fibonacciIterative(n);
        System.out.println("Fibonacci number at position " + n + " (iterative): " + fibIterative);
    }
}

/*
 * user@DESKTOP MINGW64 ~/Desktop/Projects/Java Projects
 * $ java FibonacciSequence.java
 * Fibonacci number at position 8 (recursive): 21
 * Fibonacci number at position 8 (iterative): 21
 */
import java.util.Scanner;

public class GradeChecker {
    static Scanner input;

    public static void main(String[] args) {
        // Instantiate a scanner object
        input = new Scanner(System.in);

        // Display program information
        System.out.println("Welcome to Grade Checker");

        // Possible grades for student
        String[] grades = { "A", "AB", "B", "BC", "C", "CD", "D", "F" };

        // Add a line break
        System.out.println();

        // Initialize counter iteration value
        int counter = 0;

        // Ask [n] times -> (based on length of grades array) for score of user
        while (counter < grades.length) {
            // Ask for user aggregate score
            System.out.print("\nInput your aggregate score to check your grade: ");
            int score = input.nextInt();

            // Check inputted grade, then display grade for the score
            if (score <= 39) {
                getGrade(score, grades, 7);
            } else if (score >= 40 && score <= 49) {
                getGrade(score, grades, 6);
            } else if (score >= 50 && score <= 54) {
                getGrade(score, grades, 5);
            } else if (score >= 55 && score <= 59) {
                getGrade(score, grades, 4);
            } else if (score >= 60 && score <= 64) {
                getGrade(score, grades, 3);
            } else if (score >= 65 && score <= 69) {
                getGrade(score, grades, 2);
            } else if (score >= 70 && score <= 74) {
                getGrade(score, grades, 1);
            } else if (score >= 75 && score <= 100) {
                getGrade(score, grades, 0);
            } else {
                System.out.println("Your inputted score is invalid.");
            }

            // Increment counter iteration value
            counter++;

        }
    }

    public static void getGrade(int aggScore, String[] gradesArr, int grade) {
        System.out.printf("Your score of %d earned you a grade of: %s\n", aggScore, gradesArr[grade]);
    }
}

// FIXME: Debug accessing grade at [index] issue
// for (int i = 0; i < gradesArr.length; i++) {
// System.out.printf("Your score of %d earned you a grade of: %s\n", aggScore,
// gradesArr[grade]);
// }
#include <stdio.h>

void getGrade(int aggScore, char gradesArr[], int grade);

int main()
{
    // Display program information
    printf("Welcome to Grade Checker");

    // Possible grades for student
    char grades[9] = {'A', 'AB', 'B', 'BC', 'C', 'CD', 'D', 'E', 'F'};

    // Add a line break
    printf("\n");

    // Initialize counter iteration value
    int counter = 0;

    // Ask [n] times -> (based on length of grades array) for score of user
    while (counter < 9)
    {
        int score = 0;

        // Ask for user aggregate score
        printf("\nInput your aggregate score to check your grade: ");
        scanf("%d", &score);

        // Check inputted grade, then display grade for the score
        if (score <= 39)
        {
            getGrade(score, grades, 8);
        }
        else if (score >= 40 && score <= 44)
        {
            getGrade(score, grades, 7);
        }
        else if (score >= 45 && score <= 49)
        {
            getGrade(score, grades, 6);
        }
        else if (score >= 50 && score <= 54)
        {
            getGrade(score, grades, 5);
        }
        else if (score >= 55 && score <= 59)
        {
            getGrade(score, grades, 4);
        }
        else if (score >= 60 && score <= 64)
        {
            getGrade(score, grades, 3);
        }
        else if (score >= 65 && score <= 69)
        {
            getGrade(score, grades, 2);
        }
        else if (score >= 70 && score <= 74)
        {
            getGrade(score, grades, 1);
        }
        else if (score >= 75 && score <= 100)
        {
            getGrade(score, grades, 0);
        }
        else
        {
            printf("Your inputted score is invalid.");
        }

        // Increment counter iteration value
        counter++;

        return 0;
    }
}

void getGrade(int aggScore, char gradesArr[], int grade)
{
    printf("Your score of %d earned you a grade of: %s\n", aggScore, gradesArr[grade]);
}

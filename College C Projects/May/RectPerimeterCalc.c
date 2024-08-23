#include <stdio.h>

int main()
{
    printf("Rectangle Perimeter Calculator V 1.0.0");

    // Declare variables
    double length, width, perimeter;

    // Ask for length of rectangle
    printf("\nEnter rectangle length: ");
    scanf("%lf", &length);

    // Ask for width of rectangle
    printf("\nEnter rectangle width: ");
    scanf("%lf", &width);

    // Evaluate and append result
    perimeter = 2 * (length + width);

    // Display result
    printf("\nThe perimeter of rectangle length: %lf, width: %lf = %lf", length, width, perimeter);

    return 0;
}

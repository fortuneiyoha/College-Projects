#include <stdio.h>

int main()
{
    printf("A program to display a user bio.");

    // Declare variables
    char first_name[25], last_name[25], bio[255];

    // Ask for user firstname and lastname
    printf("\nEnter your firstname and lastname: ");
    scanf("%s%s", &first_name, &last_name);

    // Ask for user bio
    printf("\nEnter your bio: ");
    scanf(" %[^\n]", bio);
    // fgets(bio, sizeof(bio), stdin);

    // Display user firstname with bio
    printf("\nA user named %s %s bio: %s.", first_name, last_name, bio);

    return 0;
}

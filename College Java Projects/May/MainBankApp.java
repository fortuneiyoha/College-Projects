public class MainBankApp {
    public static void main(String[] args) {
        System.out.println("\nBank App Version 1.0.0");
        System.out.println("\nA program that validates if a user bank account exists.");
        System.out.println("\nCurrent Status:");

        String userName;
        Boolean hasBankAcc;

        userName = "Great";
        hasBankAcc = true;

        // Checks if a username and account type exist
        if (!userName.isBlank() && hasBankAcc) {
            System.out.printf("A user named \"%s\" bank account exists.", userName);
        } else if (!userName.isBlank() && !hasBankAcc) {
            System.out.printf("A user named \"%s\" bank account does not exists.", userName);
        } else {
            System.out.println("No user account exists.");
        }
    }
}
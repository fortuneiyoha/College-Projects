import java.util.Scanner;
import java.util.Stack;

class BankAccount {
    // Fields
    private int accountId;
    private String accountName;
    private String accountType;
    private double accountBalance;

    // Constructor
    public BankAccount(int accountId, String accountName, String accountType, double accountBal) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountType = accountType;
        this.accountBalance = accountBal;
    }

    // Methods
    public int getAccountId() {
        // System.out.println(accountName + " account id is: $" + accountId);
        return this.accountId;
    }

    public void getAccountBalance() {
        System.out.println(accountName + " account balance is: $" + accountBalance);
    }

    public void getAccountType() {
        System.out.println(accountName + " account type is: $" + accountType);
    }

    public void setAccountType(String accType) {
        this.accountType = accType;
    }
}

public class BankApp {
    static Scanner input;

    public static void main(String[] args) {
        // Instantiate a scanner object
        input = new Scanner(System.in);

        // Instantiate an account database
        // TODO: Add users created dynamically
        Stack<Object> Users = new Stack<>();

        System.out.println();
        System.out.println("Bank App V1.0.0");
        System.out.println("Welcome to Laxo Bank.");
        System.out.println("\nWhat would you like to do today: \n" +
                "1. Create account\n" +
                "2. Deposit money\n" +
                "3. Check balance\n" +
                "4. Withdraw money\n" +
                "5. Transfer money\n");

        // if (!Users.contains(BankAccount.getAccountId())) {
        // System.out.print("Enter your name: ");
        // String name = input.nextLine();
        // } else {
        // System.out.println("A user with that id already exists.");
        // }

        // TODO: Display dynamically based on user input
        // // Declare and Initialize bank account variables
        // System.out.print("Enter your name: ");
        // String name = input.nextLine();

        // System.out.print("Enter your account type savings or current: ");
        // String accType = input.nextLine();

        // System.out.print("Deposit an amount: ");
        // double accBal = input.nextDouble();

        // // Create a bank account
        // BankAccount user = new BankAccount(1, name, accType, accBal);

        // // Display bank account balance
        // user.getAccountBalance();
    }
}
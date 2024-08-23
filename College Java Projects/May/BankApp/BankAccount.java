public class BankAccount {
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
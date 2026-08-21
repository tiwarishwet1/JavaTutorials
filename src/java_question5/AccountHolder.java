package in.mindcraft;

public class AccountHolder {

    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public AccountHolder(
            int accountNumber,
            String accountHolderName,
            double accountBalance) {

        super();

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {

        if (amount > 0) {

            accountBalance += amount;

            System.out.println("Deposited amount: " + amount);

        } else {

            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {

        if (amount > 0 && amount <= accountBalance) {

            accountBalance -= amount;

            System.out.println("Withdraw amount: " + amount);

        } else {

            System.out.println(
                    "Invalid withdrawal amount or insufficient balance"
            );
        }
    }

    @Override
    public String toString() {

        return "Account Number: " + accountNumber
                + "\nAccount Holder: " + accountHolderName
                + "\nAccount Balance: " + accountBalance;
    }
}
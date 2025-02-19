package transaction_management;

public class BankAccount implements BackAccountInterface {
    private int accountNumber = 12345;
    private int balance = 2000;

    /**
     * Sets the account number for the bank account.
     * 
     * @param accountNumber The account number to set.
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Gets the account number for the bank account.
     * 
     * @return The account number of the bank account.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the balance of the bank account.
     * 
     * @param balance The balance to set for the account.
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /**
     * Gets the balance of the bank account.
     * 
     * @return The current balance of the bank account.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Deposits a given amount into the bank account.
     * 
     * @param amount The amount to deposit into the account.
     * @throws InvalidAmountException If the deposit amount is negative.
     */
    public void deposit(int amount) throws InvalidAmountException {
        if (amount < 0) {    
            throw new InvalidAmountException("Enter valid amount");
        } else {
            balance = balance + amount;
            System.out.println("For account number " + accountNumber);
            System.out.println("Deposited amount: " + amount);
            System.out.println("New balance: " + balance);
        }
    }

    /**
     * Withdraws a specified amount from the bank account.
     * 
     * @param withdrawAmount The amount to withdraw from the account.
     * @throws InsufficientFundsException If the account has insufficient funds to complete the withdrawal.
     */
    public void withdraw(int withdrawAmount) throws InsufficientFundsException {
        if (withdrawAmount > balance) {
            throw new InsufficientFundsException("Insufficient Balance to withdraw...");
        } else {
            balance = balance - withdrawAmount;
            System.out.println("Successfully withdrawn");
            System.out.println("After withdrawal, available balance: " + balance);
        }
    }

    /**
     * Displays the current available balance in the bank account.
     */
    public void checkBalance() {
        System.out.println("Available Balance: " + balance);
    }
}

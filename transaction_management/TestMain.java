package transaction_management;

import java.util.Scanner;

public class TestMain {

    /**
     * Main method to execute the banking operations based on user input.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankaccount = new BankAccount();
        System.out.println("Enter Account Number: ");
        int accountNumber = scanner.nextInt(); // Reading account number input from user
        try {
            // Check if the account number is valid
            if (accountNumber == 12345) {
                System.out.println("Enter option (deposit/withdraw/balance) : ");
                String option = scanner.next(); // Reading the operation (deposit, balance, or withdraw)

                // Switch based on the user-selected option
                switch (option) {
                    case "deposit":
                        System.out.println("Enter amount to deposit: ");
                        int amount = scanner.nextInt(); // Reading deposit amount
                        try {
                            // Try depositing the amount
                            bankaccount.deposit(amount);
                        } catch (InvalidAmountException e) {
                            // Catch InvalidAmountException if amount is invalid
                            e.printStackTrace();
                            System.exit(amount); // Exit program if exception is thrown
                        }
                        break;

                    case "balance":
                        // Check and display the balance
                        bankaccount.checkBalance();
                        break;

                    case "withdraw":
                        System.out.println("Enter amount to be withdrawl: ");
                        int withdrawAmount = scanner.nextInt(); // Reading withdrawal amount
                        try {
                            // Try withdrawing the specified amount
                            bankaccount.withdraw(withdrawAmount);
                        } catch (InsufficientFundsException e) {
                            // Catch InsufficientFundsException if balance is insufficient
                            e.printStackTrace();
                        }
                        break;

                    default:
                        System.out.println("Invalid option. Please choose from 'deposit', 'balance', or 'withdraw'.");
                }
            } else {
                // Throw InvalidAccountException if the account number is incorrect
                throw new InvalidAccountException("Enter valid account number");
            }
        } catch (InvalidAccountException e) {
            // Catch InvalidAccountException if account number is invalid
            System.out.println(e);
        }
    }
}

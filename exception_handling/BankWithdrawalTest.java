package exception_handling;
class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}
}

public class BankWithdrawalTest {

	// Method to perform a withdrawal, throws custom exception if insufficient funds
	public static int withdraw(int balance, int amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException("Withdrawal amount exceeds available balance.");
		}
		return balance - amount;
	}

	public static void main(String[] args) {
		int balance = 1000; // Example balance
		int amountToWithdraw = 1500; // Example withdrawal amount

		try {
			int newBalance = withdraw(balance, amountToWithdraw);
			System.out.println("Withdrawal successful. New balance: " + newBalance);
		} catch (InsufficientFundsException e) {
			System.err.println("Withdrawal failed: " + e.getMessage());
		}
	}
}

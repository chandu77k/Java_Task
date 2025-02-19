package transaction_management;

public interface BackAccountInterface {
	public void deposit(int amount) throws InvalidAmountException;
	public void withdraw(int withdrawAmount) throws InsufficientFundsException;
	public void checkBalance();
}

package transaction_management;

public class InsufficientFundsException extends RuntimeException {

    /**
     * Constructor for InsufficientFundsException that accepts a message.
     * 
     * @param message The message to be passed to the exception. This message provides details about the exception.
     */
    public InsufficientFundsException(String message) {
        super(message); // Passes the message to the parent Exception class
    }
}

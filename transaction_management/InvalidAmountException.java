package transaction_management;

public class InvalidAmountException extends Exception {

    /**
     * Constructor for InvalidAmountException that accepts a message.
     * 
     * @param message The message to be passed to the exception. This message provides details about the exception.
     */
    public InvalidAmountException(String message) {
        super(message); // Passes the message to the parent Exception class
    }
}

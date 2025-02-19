package transaction_management;

public class InvalidAccountException extends Exception {

    /**
     * Constructor for InvalidAccountException that accepts a message.
     * 
     * @param message The message to be passed to the exception. This message describes the reason for the exception.
     */
    public InvalidAccountException(String message) {
        super(message); // Passes the message to the parent Exception class
    }
}

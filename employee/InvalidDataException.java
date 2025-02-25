package employee;

/**
 * Custom exception class for handling invalid data scenarios.
 */
public class InvalidDataException extends Exception {

    /**
     * Constructs a new InvalidDataException with the specified detail message.
     *
     * @param message The message describing the cause of the exception.
     */
    public InvalidDataException(String message) {
        super(message);
    }
}

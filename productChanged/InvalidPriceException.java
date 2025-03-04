package productChanged;

/**
 * Custom exception class to handle invalid product prices
 */
public class InvalidPriceException extends Exception {

    /**
     * Constructor that accepts a custom error message
     * 
     * @param message The error message to be displayed
     */
    public InvalidPriceException(String message) {
        super(message);
    }
}

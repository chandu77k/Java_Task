package productChanged;

/**
 * Custom exception class to handle invalid product categories
 */
public class InvalidCategoryException extends Exception {

    /**
     * Constructor that accepts a custom error message
     * 
     * @param message The error message to be displayed
     */
    public InvalidCategoryException(String message) {
        super(message);
    }
}

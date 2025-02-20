package e_commerce;

public class Order {
    private String orderId;
    private String name;
    private boolean processed;

    /**
     * Constructor to initialize an Order object.
     *
     * @param orderId The unique identifier for the order.
     * @param name The name of the customer
     * @param processed The status of the order
     */
    public Order(String orderId, String name, boolean processed) {
        this.orderId = orderId;
        this.name = name;
        this.processed = processed;
    }

    /**
     * Provides a string representation of the Order object.
     *
     * @return A string containing the order's ID, customer's name, and processed status.
     */
    public String toString() {
        return "Order Id: " + orderId + " Customer: " + name + " Processed: " + processed;
    }

    /**
     * Returns the unique identifier of the order.
     *
     * @return The orderId of the order.
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Returns the name of the customer who placed the order.
     *
     * @return The customer's name.
     */
    public String getCustomer() {
        return name;
    }

    /**
     * Returns the processed status of the order.
     *
     * @return true if the order is processed, false otherwise.
     */
    public boolean getProcessed() {
        return processed;
    }

    /**
     * Keeping OrderProcessed to true
     */
    public void orderProcessed() {
        this.processed = true;
    }
}

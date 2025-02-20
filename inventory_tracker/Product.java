package inventory_tracker;

public class Product {
    private String name; 
    private int stock; 

    /**
     * Constructor to initialize the product with a name and stock count.
     * 
     * @param name The name of the product.
     * @param stock The stock count for the product.
     */
    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    /**
     * @return A string representing the product's name and stock count
     */
    public String toString() {
        return " Name : " + name + " Stock count : " + stock;
    }

    /**
     * Gets the name of the product.
     * 
     * @return The name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the stock count of the product.
     * 
     * @return The stock count of the product.
     */
    public int getStock() {
        return stock;
    }
}

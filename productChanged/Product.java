package productChanged;

/**
 * Represents a product with attributes such as product ID, name, price, and category.
 * This class includes getter and setter methods, a constructor, and a method for extra details.
 */
public class Product {
    private Integer productId;
    private String productName;
    private Double price;
    private String category;

    /**
     * Constructor to initialize a product with given values.
     * 
     * @param productId   Unique identifier for the product
     * @param productName Name of the product
     * @param price       Price of the product
     * @param category    Category of the product
     */
    public Product(Integer productId, String productName, Double price, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * Displays extra details about the product.
     */
    public void extraDetails() {
        System.out.println("Extra Details on products..");
    }

    @Override
    public String toString() {
        return "Product Id : " + productId + ", Product Name : " + productName + ", Category : " + category + ", Price : " + price;
    }
}

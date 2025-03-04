package productChanged;

import java.util.*;

public class TestMain {
    
    /**
     * Checks if the given category is valid
     * 
     * @param category The category to validate
     * @return true if the category is one of Electronics, Clothing, Home, Beauty, or Sports otherwise false
     */
    private static boolean isValid(String category) {
        return category.equalsIgnoreCase("Electronics") || category.equalsIgnoreCase("Clothing")
                || category.equalsIgnoreCase("Home") || category.equalsIgnoreCase("Beauty")
                || category.equalsIgnoreCase("Sports");
    }

    public static void main(String[] args) {
        ProductList productlist = new ProductList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        Integer number = scanner.nextInt();

        for (Integer iteration = 0; iteration < number; iteration++) {
            try {
                System.out.print("Enter Product ID: ");
                Integer id = scanner.nextInt();

                System.out.print("Enter Product Name: ");
                String name = scanner.next();

                System.out.print("Enter Category : ");
                String category = scanner.next();

                // Validate category, if invalid throw custom exception
                if (!isValid(category)) {
                    throw new InvalidCategoryException("Please enter a valid category.");
                }

                System.out.print("Enter Price: ");
                Double price = scanner.nextDouble();

                // Validate price, if less than 50, throw custom exception
                if (price < 50) {
                    throw new InvalidPriceException("Price must be at least 50.");
                }

                System.out.print("Discounted product yes/no: ");
                String discountValid = scanner.next();

                // If discounted product, take discount percentage as input
                if (discountValid.equalsIgnoreCase("yes")) {
                    System.out.print("Enter Discount Percentage: ");
                    Integer discount = scanner.nextInt();
                    
                    // Create DiscountedProduct object and add to product list
                    DiscountedProduct discountedProduct = new DiscountedProduct(id, name, price, category, discount);
                    productlist.addProduct(discountedProduct);
                    
                    discountedProduct.extraDetails();
                } else {
                    // Create a normal Product object and add to product list
                    Product product = new Product(id, name, price, category);
                    productlist.addProduct(product);

                    product.extraDetails();
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Allow user to search for products by category
        System.out.print("Enter category to search: ");
        String search = scanner.next();
        productlist.getProduct(search);

        scanner.close();
    }
}

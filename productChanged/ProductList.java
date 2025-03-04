package productChanged;

import java.util.*;

public class ProductList {

    private Map<String, List<Product>> productMap = new HashMap<>();

    /**
     * Adds a product to the product list and groups it by category
     * @param product The product to be added
     */
    public void addProduct(Product product) {
        String category = product.getCategory();

        // If the category is not already in the map add a new list for it
        if (!productMap.containsKey(category)) {
            productMap.put(category, new ArrayList<>());
        }

        // Retrieve the list of products for this category and add the new product
        List<Product> productList = productMap.get(category);
        productList.add(product);

        System.out.println("Product added: " + product);
    }

    /**
     * Retrieves and displays all products belonging to the given category.
     * The products are sorted in descending order of price before displaying.
     * 
     * @param category The category for which products are to be retrieved
     */
    public void getProduct(String category) {
        List<Product> productList = productMap.get(category);

        if (productList != null) {
            productList.sort((product1, product2) -> product2.getPrice().compareTo(product1.getPrice()));
            System.out.println("Products in category: " + category);
            for (Product product : productList) {
                System.out.println(product);
            }
        } else {
            System.out.println("No products found in category: " + category);
        }
    }
}

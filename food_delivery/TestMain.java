package food_delivery;
import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a type (customer, restaurant, or delivery driver)
        System.out.println("Login Type : ");
        String type = scanner.next();

        // Switch statement based on the user's input (customer, restaurant, or delivery driver)
        switch (type) {
            case "customer":
                // If the type is "customer", create a Customer object and set its properties
                Customer customer = new Customer();
                customer.setCustId("123");
                customer.setName("Chandu");
                customer.setMobile("9182234473");

                // Display customer details
                System.out.println("Customer ID: " + customer.getCustId());
                System.out.println("Customer Name: " + customer.getName());
                System.out.println("Customer Mobile: " + customer.getMobile());

                // Call customer methods for login, register, view profile, and place an order
                customer.login();
                customer.register();
                customer.viewprofile();
                customer.placeorder();
                break;

            case "restaurant":
                // If the type is "restaurant", create a Restaurant object and set its properties
                Restaurant restaurant = new Restaurant();
                restaurant.setRestoId("Resto123");
                restaurant.setRestoName("Foo");
                restaurant.setRestoMobile("9876543210");

                // Display restaurant details
                System.out.println("Restaurant ID: " + restaurant.getRestoId());
                System.out.println("Restaurant Name: " + restaurant.getRestoName());
                System.out.println("Restaurant Mobile: " + restaurant.getRestoMobile());

                // Call restaurant methods for login, register, view profile, and place an order
                restaurant.login();
                restaurant.register();
                restaurant.viewprofile();
                restaurant.placeorder();
                break;

            case "deliverydriver":
                // If the type is "deliverydriver", create a DeliveryDriver object and set its properties
                DeliveryDriver deliverydriver = new DeliveryDriver();
                deliverydriver.setDriverId("Resto123");
                deliverydriver.setDriverName("Foo");
                deliverydriver.setDriverMobile("9876543210");

                // Display delivery driver details
                System.out.println("Delivery Driver ID: " + deliverydriver.getDriverId());
                System.out.println("Delivery Driver Name: " + deliverydriver.getDriverName());
                System.out.println("Delivery Driver Mobile: " + deliverydriver.getDriverMobile());

                // Call delivery driver methods for login, register, view profile, and place an order
                deliverydriver.login();
                deliverydriver.register();
                deliverydriver.viewprofile();
                deliverydriver.placeorder();
                break;

            default:
                // If the input type doesn't match any case, print an invalid type message
                System.out.println("Invalid type.");
                break;
        }

        // Call the Menu class methods to display menu options
        Menu menu = new Menu();
        menu.lists();        // Display list of menu items
        menu.sandwitch();    // Display sandwich items

        // If the type is customer, process the customer's food selection and order
        if (type.contentEquals("customer")) {
            // Create a FoodItem object to handle the customer's food selection
            FoodItem fooditem = new FoodItem();
            System.out.println("\nSelect item : ");
            String selectitem = scanner.next();  // Take user input for food selection

            // Based on the user's selection, call the food method to display details for the selected item
            if (selectitem.contentEquals("pizza")) {
                fooditem.food("pizza");
            } else if (selectitem.contentEquals("burger")) {
                fooditem.food("burger");
            } else if (selectitem.contentEquals("sandwitch")) {
                fooditem.food("sandwitch");
            }

            // Create a Cart object to add the selected food item to the cart
            Cart cart = new Cart();
            cart.addedItems();  // Add items to the cart
            System.out.println(selectitem);  // Print the selected item

            // Create an Order object to process the order based on the selected item
            Order ordered = new Order();
            if (selectitem.contentEquals("pizza")) {
                ordered.orders("\npizza");
            } else if (selectitem.contentEquals("burger")) {
                ordered.orders("\nburger");
            } else if (selectitem.contentEquals("sandwitch")) {
                ordered.orders("\nsandwitch");
            }

            // Create a Realtime object to handle real-time delivery tracking
            Realtime realtime = new Realtime();
            realtime.startDelivery();    // Start the delivery process
            realtime.trackProgress();    // Track the progress of delivery
            realtime.completeDelivery(); // Mark the delivery as complete

            // Create an Estimated object to handle estimated delivery tracking
            Estimated estimate = new Estimated();
            estimate.startDelivery();    // Start the estimated delivery process
            estimate.trackProgress();    // Track the estimated delivery progress
            estimate.completeDelivery(); // Mark the estimated delivery as complete
        }

        // Create a PaymentGateway object to process the payment and calculate total amount
        Payment.PaymentGateway paymentgateway = new Payment.PaymentGateway();
        paymentgateway.processPayment();  // Process the payment
        paymentgateway.calculateTotalAmount(100, 200);  // Calculate the total amount (example amounts)

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

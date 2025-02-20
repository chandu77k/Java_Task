package e_commerce;
import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        // Create a list to store orders
        List<Order> list = new LinkedList<>();

        list.add(new Order("O_123", "Chandu", true));
        list.add(new Order("O_456", "Dhanush", false));
        list.add(new Order("O_789", "Jagadeesh", true));
        list.add(new Order("O_012", "Nirmal", false));
        // Create an iterator to iterate over the order list
        Iterator<Order> iterator = list.iterator();
        
        // Iterate over the list
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (!order.getProcessed()) {
                order.orderProcessed();
                // Removes the current unprocessed order from the list
                iterator.remove();
            }
        }
        System.out.println("Processed Orders: ");
        for (Order order : list) {
            System.out.println(order);
        }
    }
}

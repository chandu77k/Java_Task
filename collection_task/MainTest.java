package collection_task;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("User Sessions : ");

        // Creating a map to store user sessions
        Map<String, CustomSession> map = new HashMap<String, CustomSession>();
        
        map.put("1", new CustomSession("Chandu", "Java", "Active"));
        map.put("2", new CustomSession("Dhanush", "Python", "Inactive"));
        map.put("3", new CustomSession("Jagadeesh", "C++", "Active"));
        map.put("4", new CustomSession("Venkat", "Data Structure", "Active"));

        // Iterating through the map
        Iterator<Map.Entry<String, CustomSession>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, CustomSession> entry = iterator.next();

            // Removing session with key "2" 
            if (entry.getKey().equals("2")) {
                iterator.remove();
            }

            // Updating the session with key "3"
            if (entry.getKey().equals("3")) {
                map.put("3", new CustomSession("Raju", "C++", "Inactive"));
            }
        }
        
        for (Map.Entry<String, CustomSession> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}

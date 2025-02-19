package collections;
import java.util.*;

public class MainTest {

    public static void main(String[] args) {
        
        // Create a list of subjects for person 1
        List<String> subject1 = new ArrayList<>();
        subject1.add("Java");
        subject1.add("Python");
        
        // Create a Person object with name, age, city, and subjects
        Person personobject1 = new Person("Chandu", 22, "Hyderabad", subject1);
        
        // Create a list of subjects for person 2
        List<String> subject2 = new ArrayList<>();
        subject2.add("C++");
        subject2.add("Data Structures");
        
        // Create another Person object
        Person personobject2 = new Person("Dhanush", 40, "Mumbai", subject2);
        
        // Create a list of subjects for person 3
        List<String> subject3 = new ArrayList<>();
        subject3.add("Algorithms");
        subject3.add("Networking");
        
        // Create another Person object
        Person personobject3 = new Person("Venkat", 23, "Bengaluru", subject3);
        
        // Create a Person object with the same subjects as person 2
        Person personobject4 = new Person("Jagadeesh", 21, "Chennai", subject2);
        
        // Create an ArrayList to hold Person objects
        List<Person> list = new ArrayList<>();
        list.add(personobject1);
        list.add(personobject2);
        list.add(personobject3);
        
        // Create a HashSet to hold Person objects
        Set<Person> set = new HashSet<>();
        set.add(personobject1);
        set.add(personobject2);
        set.add(personobject3);
        
        // Create a Vector to hold Person objects
        Vector<Person> vector = new Vector<>();
        vector.add(personobject1);
        vector.add(personobject2);
        vector.add(personobject3);
        
        // Create a Queue to hold Person objects
        Queue<Person> queue = new LinkedList<>();
        queue.add(personobject1);
        queue.add(personobject2);
        queue.add(personobject3);
        
        list.remove(0); // Removes the first element
        list.add(personobject4); // Adds personobject4 at the end
        list.set(1, personobject1); // Replaces element at index 1 with personobject1
               
        set.add(personobject4); // Adds personobject4
        set.remove(personobject2); // Removes personobject2
              
        vector.add(1, personobject4); // Adds personobject4 at index 1
        vector.remove(2); // Removes element at index 2
        
        // Remove the head of the queue
        queue.poll();
        
        // Output results
        System.out.println("ArrayList Output : ");
        System.out.println(list); // Prints the ArrayList
        
        System.out.println("List is empty or not : " + list.isEmpty()); // Checks if ArrayList is empty
        
        System.out.println("HashSet Output : ");
        System.out.println(set); // Prints the HashSet
        
        System.out.println("Vector Output : ");
        System.out.println(vector); // Prints the Vector
        System.out.println("Vector contains personobject1 : " + vector.contains(personobject1)); // Check if personobject1 is in Vector
        
        System.out.println("Queue using LinkedList : ");
        System.out.println(queue); // Prints the Queue
        System.out.println("Queue Size: " + queue.size()); // Prints the size of the Queue
        System.out.println(queue.peek()); // Prints the head of the Queue
    }

}

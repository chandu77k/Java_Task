package collections;
import java.util.*;

public class Person {
    
    // Declare private fields for name, age, city, and subjects
    private String name;
    private int age;
    private String city;
    private List<String> subject;
    
    // Constructor to initialize the Person object
    public Person(String name, int age, String city, List<String> subject) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.subject = subject;
    }
    
    public String toString() {
        return "name : " + name + " age : " + age + " city : " + city + " subject : " + subject;
    }
    
    // Getter method for the name
    public String getName() {
        return name;
    }
    
    // Getter method for the age
    public int getAge() {
        return age;
    }
    
    // Getter method for the city
    public String getCity() {
        return city;
    }
    
    // Getter method for the list of subjects
    public List<String> getSubject() {
        return subject;
    }
}

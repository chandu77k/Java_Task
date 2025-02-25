package employee;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Main class to test employee operations.
 */
public class TestMain {
    /**
     * The entry point of the program, demonstrating employee operations.
     */
    public static void main(String[] args) {
        try {
            // Creating departments
            Department dept1 = new Department(1, "CSE");
            Department dept2 = new Department(2, "CIVIL");

            // Formatting dates
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date joinDate1 = sdf.parse("2003-02-07");
            Date joinDate2 = sdf.parse("2009-07-04");
            Date joinDate3 = sdf.parse("2015-12-21");

            // Creating employee objects
            Employee emp1 = new Employee(1, "Chandu", dept1, 77000, joinDate1);
            Employee emp2 = new Employee(2, "Dhanush", dept1, 33000, joinDate2);
            Employee emp3 = new Employee(3, "Jagadeesh", dept2, 99000, joinDate3);

            // Creating operations instance
            Operations operations = new Operations();

            // Adding employees
            operations.addEmployee(emp1);
            operations.addEmployee(emp2);
            operations.addEmployee(emp3);

            // Updating an employee's details
            System.out.println("\nUpdated Employee:");
            operations.updateEmployee(1, "CSE", "Chandu", 100000, sdf.parse("2025-02-07"));

            // Retrieving employees from CSE department
            System.out.println("\nGet Data:");
            operations.getEmployee("CSE");

            // Deleting an employee
            System.out.println("\nDelete Employee:");
            operations.deleteEmployee(2, "CSE");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

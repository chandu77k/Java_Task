package employee;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Main class to test employee operations.
 */
public class TestMain {
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
			Date joinDate4 = sdf.parse("2020-05-01");

			// Creating employee objects
			Employee emp1 = new Employee(1, "Chandu", dept1, 77000.0, joinDate1);
			Employee emp2 = new Employee(2, "Dhanush", dept1, 33000.0, joinDate2);
			Employee emp3 = new Employee(3, "Jagadeesh", dept2, 99000.0, joinDate3);
			Employee emp4 = new Employee(4, "Basha", dept1, 88000.0, joinDate4);

			// Creating operations instance
			Operations operations = new Operations();
			
			System.out.println("Adding Employees : ");
			// Adding employees
			operations.addEmployee(emp1);
			operations.addEmployee(emp2);
			operations.addEmployee(emp3);
			operations.addEmployee(emp4);

			// Retrieving employees from CSE department sorted by join date (reverse order)
			System.out.println("\nGet Employees sorted by Join Date (Reverse):");
			operations.getEmployee("CSE");

			// Updating an employee's details
			System.out.println("\nUpdated Employee:");
			operations.updateEmployee(1, "CSE", "Chandu Updated", 100000.0, sdf.parse("2025-02-07"));

			// Deleting an employee
			System.out.println("\nDelete Employee:");
			operations.deleteEmployee(2, "CSE");

			// Sorting employees by name, salary, and join date after delete
			operations.sortEmployees("CSE");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

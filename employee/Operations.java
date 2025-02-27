package employee;

import java.util.*;

/**
 * Operations class to manage employee CRUD operations.
 */
public class Operations {
	private Map<String, List<Employee>> departmentMap = new HashMap<>();

	/**
	 * Adds an employee to the department map.
	 * 
	 * @param employee the employee object to be added.
	 * @return void
	 */
	public void addEmployee(Employee employee) {
		// Get the department name for the employee
		String departmentName = employee.getDept().getDeptName();

		// If the department does not exist, create a new list for that department
		if (!departmentMap.containsKey(departmentName)) {
			departmentMap.put(departmentName, new ArrayList<>());
		}

		// Retrieve the list of employees in that department and add the new employee
		List<Employee> employeesInDepartment = departmentMap.get(departmentName);
		employeesInDepartment.add(employee);

		System.out.println("Employee added: " + employee);
	}

	/**
	 * Updates an employee's details
	 * 
	 * @param empId       the ID of the employee to update.
	 * @param deptName    the department name where the employee is located.
	 * @param empName     the new name of the employee.
	 * @param salary      the new salary of the employee.
	 * @param empJoinDate the new join date of the employee.
	 * @throws InvalidDataException if the employee ID or department does not exist.
	 * @return void
	 */
	public void updateEmployee(Integer empId, String deptName, String empName, Double salary, Date empJoinDate)
			throws InvalidDataException {
		// Get the list of employees in the given department
		List<Employee> employeesInDepartment = departmentMap.get(deptName);

		if (employeesInDepartment != null) {
			// Loop through the employees and update the matching one
			for (Employee emp : employeesInDepartment) {
				if (emp.getEmpId().equals(empId)) {
					emp.setEmpName(empName);
					emp.setSalary(salary);
					emp.setEmpJoinDate(empJoinDate);
					System.out.println("Employee updated: " + emp);
					return;
				}
			}
			throw new InvalidDataException("Employee not found with ID: " + empId);
		} else {
			throw new InvalidDataException("Department not found: " + deptName);
		}
	}

	/**
	 * Deletes an employee from the department based on their employee ID.
	 * 
	 * @param empId    the ID of the employee to delete.
	 * @param deptName the department name where the employee is located.
	 * @throws InvalidDataException if the employee ID or department does not exist.
	 * @return void
	 */
	public void deleteEmployee(Integer empId, String deptName) throws InvalidDataException {
		// Get the list of employees in the given department
		List<Employee> employeesInDepartment = departmentMap.get(deptName);

		if (employeesInDepartment != null) {
			// Iterate through the list of employees to find and remove the specified one
			Iterator<Employee> iterator = employeesInDepartment.iterator();
			while (iterator.hasNext()) {
				Employee emp = iterator.next();
				if (emp.getEmpId().equals(empId)) {
					iterator.remove();
					System.out.println("Employee deleted: " + emp);
					return;
				}
			}
			throw new InvalidDataException("Employee not found with ID: " + empId);
		} else {
			throw new InvalidDataException("Department not found: " + deptName);
		}
	}

	/**
	 * Retrieves and prints all employees in a department, sorted by join date in
	 * reverse order.
	 * 
	 * @param deptName the department name where the employees are located.
	 * @return void
	 */
	public void getEmployee(String deptName) {
		// Get the list of employees in the given department
		List<Employee> employeesInDepartment = departmentMap.get(deptName);

		if (employeesInDepartment != null) {
			// Sort the employees by join date in reverse order
			employeesInDepartment
					.sort((employee1, employee2) -> employee2.getEmpJoinDate().compareTo(employee1.getEmpJoinDate()));

			// Print the sorted list of employees
			System.out.println("\nEmployees in " + deptName + " department (sorted by join date):");
			for (Employee emp : employeesInDepartment) {
				System.out.println(emp);
			}
		} else {
			System.out.println("Department not found: " + deptName);
		}
	}

	/**
	 * Sorts employees in a department by multiple sorting
	 * 
	 * @param deptName the department name where the employees are located.
	 * @return void
	 */
	public void sortEmployees(String deptName) {
		// Get the list of employees in the given department
		List<Employee> employeesInDepartment = departmentMap.get(deptName);

		if (employeesInDepartment != null) {
			employeesInDepartment.sort(Comparator.comparing(Employee::getEmpName) // First sort by name
					.thenComparing(Employee::getSalary) // If names are the same, sort by salary
					.thenComparing(Employee::getEmpJoinDate) // If both name and salary are the same, sort by join date
			);

			// Print the sorted list of employees
			System.out.println("\nEmployees in " + deptName + " department (sorted by name, salary, and join date):");
			for (Employee emp : employeesInDepartment) {
				System.out.println(emp);
			}
		} else {
			System.out.println("Department not found: " + deptName);
		}
	}
}

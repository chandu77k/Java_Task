package employee;

import java.util.*;

/**
 * This class handles employee operations.
 */
public class Operations {
	Map<String, List<Employee>> departments = new HashMap<>();

	/**
	 * Adds an employee to the respective department. Employees are sorted
	 * alphabetically by name after addition.
	 *
	 * @param employee The employee object to be added.
	 * @throws InvalidDataException If the employee already exists in the
	 *                              department.
	 */
	public void addEmployee(Employee employee) throws InvalidDataException {
		List<Employee> employeeList = departments.get(employee.getDepartment().getDeptName());
		if (employeeList == null) {
			employeeList = new ArrayList<>();
		}

		if (!employeeList.contains(employee)) {
			employeeList.add(employee);
			Collections.sort(employeeList, Comparator.comparing(Employee::getEmpName));
			departments.put(employee.getDepartment().getDeptName(), employeeList);
			printEmployeeList(employee.getDepartment().getDeptName());
		} else {
			throw new InvalidDataException("Employee already exists");
		}
	}

	/**
	 * Deletes an employee from a department.
	 *
	 * @param empId    The ID of the employee to be removed.
	 * @param deptName The department name from which the employee is to be deleted.
	 * @throws InvalidDataException If the employee or department is not found.
	 */
	public void deleteEmployee(int empId, String deptName) throws InvalidDataException {
		List<Employee> employeeList = departments.get(deptName);
		if (employeeList != null) {
			Employee empToDelete = null;
			for (Employee emp : employeeList) {
				if (emp.getEmpId() == empId) {
					empToDelete = emp;
					break;
				}
			}
			if (empToDelete != null) {
				employeeList.remove(empToDelete);
				Collections.sort(employeeList, Comparator.comparing(Employee::getEmpName));
				printEmployeeList(deptName);
			} else {
				throw new InvalidDataException("Employee not found");
			}
		} else {
			throw new InvalidDataException("Department not found");
		}
	}

	/**
	 * Updates the details of an employee.
	 *
	 * @param empId    The ID of the employee to be updated.
	 * @param deptName The name of the department in which the employee exists.
	 * @param name     The new name of the employee.
	 * @param salary   The new salary of the employee.
	 * @param joinDate The new joining date of the employee.
	 * @throws InvalidDataException If the employee or department is not found.
	 */
	public void updateEmployee(int empId, String deptName, String name, int salary, Date joinDate)
			throws InvalidDataException {
		List<Employee> employeeList = departments.get(deptName);
		if (employeeList != null) {
			boolean found = false;
			for (Employee emp : employeeList) {
				if (emp.getEmpId() == empId) {
					emp.updateEmployee(name, salary, joinDate);
					found = true;
					break;
				}
			}
			if (found) {
				Collections.sort(employeeList, Comparator.comparing(Employee::getEmpName));
				printEmployeeList(deptName);
			} else {
				throw new InvalidDataException("Employee not found");
			}
		} else {
			throw new InvalidDataException("Department not found");
		}
	}

	/**
	 * Retrieves and prints all employees in a department, sorted in descending
	 * order of their joining date.
	 *
	 * @param deptName The name of the department.
	 * @throws InvalidDataException If the department is not found.
	 */
	public void getEmployee(String deptName) throws InvalidDataException {
		List<Employee> employeeList = departments.get(deptName);
		if (employeeList != null) {
			employeeList.sort(Comparator.comparing(Employee::getEmpJoinDate).reversed());
			printEmployeeList(deptName);
		} else {
			throw new InvalidDataException("Department not found");
		}
	}

	/**
	 * Prints the list of employees in a specific department.
	 *
	 * @param deptName The name of the department.
	 */
	private void printEmployeeList(String deptName) {
		List<Employee> employeeList = departments.get(deptName);
		if (employeeList != null) {
			System.out.println("Employees in department: " + deptName);
			for (Employee emp : employeeList) {
				System.out.println(emp);
			}
		}
	}
}

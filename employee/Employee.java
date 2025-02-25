package employee;

import java.util.*;

/**
 * Represents an employee with an ID, name, department, salary, and joining date.
 */
public class Employee {
    private int empId;
    private String empName;
    private Department department;
    private int salary;
    private Date empJoinDate;

    /**
     * Constructs an Employee object with the specified details.
     *
     * @param empId      The unique employee ID.
     * @param empName    The name of the employee.
     * @param department The department to which the employee belongs.
     * @param salary     The salary of the employee.
     * @param empJoinDate The joining date of the employee.
     */
    public Employee(int empId, String empName, Department department, int salary, Date empJoinDate) {
        this.empId = empId;
        this.empName = empName;
        this.department = department;
        this.salary = salary;
        this.empJoinDate = empJoinDate;
    }

    /**
     * Gets the employee ID.
     *
     * @return The employee ID.
     */
    public int getEmpId() {
        return empId;
    }

    /**
     * Gets the employee's name.
     *
     * @return The employee name.
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Gets the department of the employee.
     *
     * @return The employee's department.
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * Gets the employee's salary.
     *
     * @return The employee's salary.
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Gets the employee's joining date.
     *
     * @return The employee's joining date.
     */
    public Date getEmpJoinDate() {
        return empJoinDate;
    }

    /**
     * Updates the employee's details.
     *
     * @param name      The new name of the employee.
     * @param salary    The new salary of the employee.
     * @param joinDate  The new joining date of the employee.
     */
    public void updateEmployee(String name, int salary, Date joinDate) {
        this.empName = name;
        this.salary = salary;
        this.empJoinDate = joinDate;
    }

    /**
     * Checks if two employees are equal based on their employee ID.
     *
     * @param obj The object to compare.
     */

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee employee = (Employee) obj;
        return empId == employee.empId;
    }

    /**
     * Generates a hash code for the employee based on their ID.
     *
     * @return The hash code of the employee.
     */

    public int hashCode() {
        return Objects.hash(empId);
    }

    /**
     * Returns a string representation of the employee details.
     *
     * @return A formatted string containing employee details.
     */

    public String toString() {
        return "EmpId: " + empId + ", Name: " + empName + ", Salary: " + salary + ", Joining Date: " + empJoinDate;
    }
}

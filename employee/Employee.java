package employee;

import java.util.Date;

/**
 * Employee class representing the employee object
 */
public class Employee {
	private Integer empId; // Changed from id to empId to be consistent with Operations class
	private String empName; // Changed from name to empName to be consistent with Operations class
	private Department dept;
	private Double salary;
	private Date empJoinDate; // Changed from joinDate to empJoinDate to be consistent with Operations class

	/**
	 * Constructor to initialize an Employee object
	 * 
	 * @param empId       the ID of the employee
	 * @param empName     the name of the employee
	 * @param dept        the department of the employee
	 * @param salary      the salary of the employee
	 * @param empJoinDate the join date of the employee
	 */
	public Employee(Integer empId, String empName, Department dept, Double salary, Date empJoinDate) {
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
		this.salary = salary;
		this.empJoinDate = empJoinDate;
	}

	/**
	 * Gets the ID of the employee
	 * 
	 * @return the ID of the employee
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * Sets the ID of the employee
	 * 
	 * @param empId the ID to set for the employee
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	/**
	 * Gets the name of the employee
	 * 
	 * @return the name of the employee
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * Sets the name of the employee
	 * 
	 * @param empName the name to set for the employee
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * Gets the department of the employee
	 * 
	 * @return the department of the employee
	 */
	public Department getDept() {
		return dept;
	}

	/**
	 * Sets the department of the employee
	 * 
	 * @param dept the department to set for the employee
	 */
	public void setDept(Department dept) {
		this.dept = dept;
	}

	/**
	 * Gets the salary of the employee
	 * 
	 * @return the salary of the employee
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * Sets the salary of the employee
	 * 
	 * @param salary the salary to set for the employee
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/**
	 * Gets the join date of the employee
	 * 
	 * @return the join date of the employee
	 */
	public Date getEmpJoinDate() {
		return empJoinDate;
	}

	/**
	 * Sets the join date of the employee
	 * 
	 * @param empJoinDate the join date to set for the employee
	 */
	public void setEmpJoinDate(Date empJoinDate) {
		this.empJoinDate = empJoinDate;
	}

	/**
	 * Provides a string representation of the Employee object.
	 * 
	 * @return a string representation of the employee in the format
	 */
	@Override
	public String toString() {
		return "Employee id=" + empId + ", name='" + empName + "', department=" + dept.getDeptName() + ", salary="
				+ salary + ", joinDate=" + empJoinDate;
	}
}

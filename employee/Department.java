package employee;

/**
 * Department class representing the department object.
 */
public class Department {
	private Integer deptId; // Renamed from id to deptId to match Employee and Operations class
	private String deptName; // Renamed from name to deptName to match Employee and Operations class

	/**
	 * Constructor to initialize a Department object.
	 * 
	 * @param deptId   the ID of the department
	 * @param deptName the name of the department
	 */
	public Department(Integer deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	/**
	 * Gets the ID of the department.
	 * 
	 * @return the ID of the department
	 */
	public Integer getDeptId() {
		return deptId;
	}

	/**
	 * Sets the ID of the department.
	 * 
	 * @param deptId the ID to set for the department
	 */
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	/**
	 * Gets the name of the department.
	 * 
	 * @return the name of the department
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * Sets the name of the department.
	 * 
	 * @param deptName the name to set for the department
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * Provides a string representation of the Department object.
	 * 
	 * @return a string representation of the department in the format: "Name :
	 *         {deptName} Id : {deptId}"
	 */
	@Override
	public String toString() {
		return "Name : " + deptName + " Id : " + deptId;
	}
}

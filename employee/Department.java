package employee;

/**
 * Represents a department within an organization.
 */
public class Department {
    private int deptId;
    private String deptName;

    /**
     * Constructs a Department object with the specified ID and name.
     *
     * @param deptId   The unique identifier for the department.
     * @param deptName The name of the department.
     */
    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    /**
     * Retrieves the department ID.
     *
     * @return The unique identifier of the department.
     */
    public int getDeptId() {
        return deptId;
    }

    /**
     * Retrieves the department name.
     *
     * @return The name of the department.
     */
    public String getDeptName() {
        return deptName;
    }
}

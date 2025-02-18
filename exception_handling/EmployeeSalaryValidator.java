package exception_handling;

class InvalidSalaryException extends Exception {
	public InvalidSalaryException(String message) {
		super(message);
	}
}

public class EmployeeSalaryValidator {

	// Method to set salary which throws an exception if salary is less than 3000
	public static void setSalary(double salary) throws InvalidSalaryException {
		if (salary < 3000) {
			throw new InvalidSalaryException("Salary must be at least 3000. Provided salary: " + salary);
		} else {
			System.out.println("Salary set successfully.");
		}
	}

	public static void main(String[] args) {
		double salaryToTest = 2500;

		try {
			setSalary(salaryToTest);
		} catch (InvalidSalaryException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}

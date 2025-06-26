//lex_auth_0130008620764692481835
//do not modify the above line

package emp;

public abstract class Employee {
	// Implement your code here
	String employeeId;
	String employeeName;
	double salary;
	static int contractIdCounter;
	static int permanentIdCounter;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	Employee(String employeeName) {
		this.employeeName = employeeName;
	}

	abstract public void calculateSalary(float salaryFactor);

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static int getContractIdCounter() {
		return contractIdCounter;
	}

	public static void setContractIdCounter(int contractIdCounter) {
		Employee.contractIdCounter = contractIdCounter;
	}

	public static int getPermanentIdCounter() {
		return permanentIdCounter;
	}

	public static void setPermanentIdCounter(int permanentIdCounter) {
		Employee.permanentIdCounter = permanentIdCounter;
	}

	
	// Uncomment the code given below after implementing the class
	// Do not modify the code given below

	@Override
	public String toString() {
		return "Employee Id: " + getEmployeeId() + ", Employee Name: " + getEmployeeName();
	}

}


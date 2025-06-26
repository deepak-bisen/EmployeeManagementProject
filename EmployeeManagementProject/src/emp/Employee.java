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

	static {
		contractIdCounter = 10000;
		permanentIdCounter = 10000;
	}
	public Employee() {}

	Employee(String employeeName) {
		this.employeeName = employeeName;
	
		if (this instanceof ContractEmployee) {
            employeeId = "C" + (++contractIdCounter);
        } else if (this instanceof PermanentEmployee) {
            employeeId = "E" + (++permanentIdCounter);
        }

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
		 if (employeeName != null && employeeName.matches("([A-Z][a-zA-Z]{1,} ?){2,}")) {
	            this.employeeName = employeeName;
	        } else {
	            throw new IllegalArgumentException("Invalid employee name!");
	        }
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		 this.salary = salary > 0 ? salary : 0;
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


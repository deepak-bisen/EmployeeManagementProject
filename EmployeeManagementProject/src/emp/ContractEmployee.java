//lex_auth_0130008620764692481835
//do not modify the above line

package emp;

public class ContractEmployee extends Employee {
	// Implement your code here
	double wagePerHour;

	public ContractEmployee(String employeeName, double wagePerHour) {
		super(employeeName);
		this.wagePerHour = wagePerHour;
	}

	@Override
	public void calculateSalary(float hoursWorked) {
		double calculatedSalary;
		if (hoursWorked >= 190) {
			calculatedSalary = wagePerHour * hoursWorked;
		} else {
			float shortfall = 190 - hoursWorked;
			double deduction = (wagePerHour / 2) * shortfall;
			calculatedSalary = (wagePerHour * hoursWorked) - deduction;
		}
		setSalary(Math.round(calculatedSalary)); // round and set
	}

	public double getWagePerHour() {
		return wagePerHour;
	}

	public void setWagePerHour(double wagePerHour) {
		this.wagePerHour = wagePerHour;
	}

	// Uncomment the code given below after implementing the class
	// Do not modify the code given below

	@Override
	public String toString() {
		return "Employee Id: " + getEmployeeId() + ", Employee Name: " + getEmployeeName() + ", Wage Per Hour: "
				+ getWagePerHour();
	}

}
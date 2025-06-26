//lex_auth_0130008620764692481835
//do not modify the above line

package emp;

public class PermanentEmployee extends Employee {
	// Implement your code here
	double basicPay;
	String[] salaryComponents;
	float exprience;
	Asset[] assets;

	public PermanentEmployee(String employeeName, double basicPay, String[] salaryComponents, Asset[] assets) {
	}

	public double calculateBonus(float exprience) {
		return 0;
	}

	public void calculateSalary(float exprience) {

	}

	public Asset[] getAssetsByDate(String lastDate) {
		return assets;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public String[] getSalaryComponents() {
		return salaryComponents;
	}

	public void setSalaryComponents(String[] salaryComponents) {
		this.salaryComponents = salaryComponents;
	}

	public float getExprience() {
		return exprience;
	}

	public void setExprience(float exprience) {
		this.exprience = exprience;
	}

	public Asset[] getAssets() {
		return assets;
	}

	public void setAssets(Asset[] assets) {
		this.assets = assets;
	}

	// Uncomment the code given below after implementing the class
	// Do not modify the code given below
	/*
	 * @Override public String toString() { return
	 * "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()
	 * +", Basic Pay: "+getBasicPay()+", Salary Components: "+getSalaryComponents()
	 * +", Assets: "+getAssets(); }
	 */
}
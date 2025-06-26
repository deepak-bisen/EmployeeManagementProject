//lex_auth_0130008620764692481835
//do not modify the above line

package emp;

import java.util.ArrayList;

public class PermanentEmployee extends Employee {
	// Implement your code here
	double basicPay;
	String[] salaryComponents;
	float experience;
	Asset[] assets;

	public PermanentEmployee(String employeeName, double basicPay, String[] salaryComponents, Asset[] assets) {
		super(employeeName); // call to base class constructor
		this.basicPay = basicPay;
		this.salaryComponents = salaryComponents;
		this.assets = assets;
	}

	public double calculateBonus(float experience) throws InvalidExperienceException {
		if (experience < 2.5f) {
			throw new InvalidExperienceException("A minimum of 2.5 years is required for bonus!");
		}
		if (experience < 4)
			return 2550;
		else if (experience < 8)
			return 5000;
		else if (experience < 12)
			return 8750;
		else
			return 13000;
	}

	@Override
	public void calculateSalary(float experience) {
		this.experience = experience;
		double da = 0, hra = 0;

		for (String comp : salaryComponents) {
			String[] parts = comp.split("-");
			String type = parts[0];
			double percent = Double.parseDouble(parts[1]) / 100.0;

			if (type.equalsIgnoreCase("DA"))
				da = basicPay * percent;
			else if (type.equalsIgnoreCase("HRA"))
				hra = basicPay * percent;
		}

		double bonus;
		try {
			bonus = calculateBonus(experience);
		} catch (InvalidExperienceException e) {
			bonus = 0;
		}

		double finalSalary = basicPay + da + hra + bonus;
		setSalary(Math.round(finalSalary));
	}

	public Asset[] getAssetsByDate(String lastDate) throws InvalidAssetsException {
		ArrayList<Asset> matchingAssets = new ArrayList<>();
		if (assets != null) {
			for (Asset asset : assets) {
				if (asset.getAssetExpiry().compareToIgnoreCase(lastDate) <= 0) {
					matchingAssets.add(asset);
				}
			}
		}
		if (matchingAssets.isEmpty()) {
			throw new InvalidAssetsException("No assets found for the given criteria!");
		}

		return matchingAssets.toArray(new Asset[0]);
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

	public float getExperience() {
		return experience;
	}

	public void setExperience(float exprience) {
		this.experience = exprience;
	}

	public Asset[] getAssets() {
		return assets;
	}

	public void setAssets(Asset[] assets) {
		this.assets = assets;
	}

	// Uncomment the code given below after implementing the class
	// Do not modify the code given below

	@Override
	public String toString() {
		return "Employee Id: " + getEmployeeId() + ", Employee Name: " + getEmployeeName() + ", Basic Pay: "
				+ getBasicPay() + ", Salary Components: " + getSalaryComponents() + ", Assets: " + getAssets();
	}

}
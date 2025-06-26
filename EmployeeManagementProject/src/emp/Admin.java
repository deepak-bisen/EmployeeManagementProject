package emp;
import java.util.ArrayList;

public class Admin {

    public void generateSalarySlip(Employee[] employees, float[] salaryFactor) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].calculateSalary(salaryFactor[i]);
        }
    }

    public int generateAssetsReport(Employee[] employees, String lastDate) {
        int totalAssets = 0;
        for (Employee emp : employees) {
            if (emp instanceof PermanentEmployee) {
                PermanentEmployee permEmp = (PermanentEmployee) emp;
                try {
                    Asset[] assets = permEmp.getAssetsByDate(lastDate);
                    totalAssets += assets.length;
                } catch (InvalidAssetsException e) {
                    System.out.println(e.getMessage());
                    return -1;
                }
            }
        }
        return totalAssets;
    }

    public String[] generateAssetsReport(Employee[] employees, char assetCategory) {
        ArrayList<String> resultList = new ArrayList<>();
        char category = Character.toUpperCase(assetCategory);

        for (Employee emp : employees) {
            if (emp instanceof PermanentEmployee) {
                PermanentEmployee permEmp = (PermanentEmployee) emp;
                Asset[] assets = permEmp.getAssets();
                if (assets != null) {
                    for (Asset asset : assets) {
                        if (Character.toUpperCase(asset.getAssetId().charAt(0)) == category) {
                            resultList.add(asset.getAssetId());
                        }
                    }
                }
            }
        }

        String[] result = new String[employees.length * 3];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}

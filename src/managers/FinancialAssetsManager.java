package managers;

import companyModules.Asset;
import companyModules.Company;
import companyModules.Employee;

public class FinancialAssetsManager extends Manager {
    public boolean canCompanySpendCash(Company company, double cashToSpend) {
        return company.getFinancialAssets() > cashToSpend;
    }

    public boolean canCompanyPayRemuneration(Company company, double remunerationToPay) {
        return company.getFinancialAssets() > remunerationToPay;
    }

    public boolean canCompanyCalculateDepreciationRate(Company company) {
        return !company.getAssetList().isEmpty();
    }

    public double calculateAssetsTotalValue(Company company) {
        double assetsTotalValue = 0;
        for (Asset asset : company.getAssetList()) {
            assetsTotalValue += asset.getAssetValue();
        }
        return assetsTotalValue;
    }

    public double calculateFinancialAssetsTotalValue(Company company) {
        return company.getFinancialAssets();
    }

    public double calcuateAssetsAndFinancialAssetsTotalValue(Company company) {
        return calculateAssetsTotalValue(company) + calculateFinancialAssetsTotalValue(company);
    }

    public double calculateTotalRemuneration(Company company) {
        double totalRemuneration = 0;

        for (Employee employee : company.getEmployeeList()) {
            totalRemuneration += employee.getSalary();
        }
        return totalRemuneration;
    }

    public void payRemuneration(Company company) {
        company.removeFinancialAsset(calculateTotalRemuneration(company));
    }

    public void calculateDepreciationRate(Company company) {
        for (int i = 0; i < company.getAssetList().size(); i++) {
            company.getAssetList().get(i).setAssetValue(company.getAssetList().get(i).getAssetValue() -
                    company.getAssetList().get(i).getAssetValue() * company.getAssetList().get(i).getAssetDepreciationRate() / 100);
        }
    }

    public void addFinancialAsset(Company company, double cashValue) {
        company.addFinancialAsset(cashValue);
    }

    public void removeFinancialAsset(Company company, double cashValue) {
        company.removeFinancialAsset(cashValue);
    }

}

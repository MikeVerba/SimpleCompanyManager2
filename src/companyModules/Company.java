package companyModules;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Company implements Serializable {
    private String companyName;
    private String headquarters;
    private String adress;
    private List<Employee> employeeList;
    private List<Asset> assets;
    private double startUpCapital;
    private double financialAssets;

    public Company(String companyName, String headquarters, String adress, double startUpCapital) {

        this.companyName = companyName;
        this.headquarters = headquarters;
        this.adress = adress;
        this.employeeList = new ArrayList<>();
        this.assets = new ArrayList<>();
        this.startUpCapital = startUpCapital;
        this.financialAssets = startUpCapital;

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Asset> getAssetList() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public double getStartUpCapital() {
        return startUpCapital;
    }

    public void setStartUpCapital(double startUpCapital) {
        this.startUpCapital = startUpCapital;
    }

    public double getFinancialAssets() {
        return financialAssets;
    }

    public void addFinancialAsset(double cashValue) {
        financialAssets += cashValue;
    }

    public void removeFinancialAsset(double cashValue) {
        financialAssets -= cashValue;
    }
}

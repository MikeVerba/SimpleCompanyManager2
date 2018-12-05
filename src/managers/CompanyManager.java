package managers;

import companyModules.Company;

import java.io.*;

public class CompanyManager extends Manager {
    public void printAllCompanyInformation(Company company) {
        String companyName = company.getCompanyName();
        String companyHeadquaters = company.getHeadquarters();
        String companyAdress = company.getAdress();
        String companyStartupCapital = String.valueOf(company.getStartUpCapital());
        String companyFinancialAssets = String.valueOf(company.getFinancialAssets());

        getPrinter().print("");
        getPrinter().print("****INFORMACJE O FIRMIE****");
        getPrinter().print("Nazwa: " + companyName);
        getPrinter().print("Siedziba: " + companyHeadquaters);
        getPrinter().print("Adress: " + companyAdress);
        getPrinter().print("Kapitał początkowy: " + companyStartupCapital);
        getPrinter().print("Środki finansowe: " + companyFinancialAssets);
    }

    public void changeCompanyName(Company company, String newCompanyName) {
        company.setCompanyName(newCompanyName);
    }

    public void changeCompanyHeadquaters(Company company, String newCompanyHeadquaters) {
        company.setHeadquarters(newCompanyHeadquaters);
    }

    public void changeCompanyAdress(Company company, String newCompanyAdress) {
        company.setAdress(newCompanyAdress);
    }

    public void changeCompanyStartUpCapital(Company company, double newCompanyStartUpCapital) {
        company.setStartUpCapital(newCompanyStartUpCapital);
    }

    public Company createCompany(String companyName, String headquarters, String adress, double startUpCapital) {
        return new Company(companyName, headquarters, adress, startUpCapital);
    }

    public void writeCompanyToFile(Company company) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Company.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(company);
            objectOutputStream.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Company readCompanyFromFile() {
        Company company = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("Company.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            company = (Company) objectInputStream.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return company;
    }
}

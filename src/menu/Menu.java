package menu;

import companyModules.Company;
import managers.*;
import utils.Printer;

import java.util.Scanner;

public class Menu {

    private Company company;
    private CompanyManager companyManager = new CompanyManager();
    private AssetManager assetManager = new AssetManager();
    private EmployeeManager employeeManager = new EmployeeManager();
    private FinancialAssetsManager financialAssetsManager = new FinancialAssetsManager();

    private TextMessages textMessages = new TextMessages();
    private Scanner scanner = new Scanner(System.in);
    private Printer printer = new Printer();

    public Company getCompany() {
        return company;
    }

    public Manager getCompanyManager() {
        return companyManager;
    }

    public Manager getAssetManager() {
        return assetManager;
    }

    public Manager getEmployeeManager() {
        return employeeManager;
    }

    public TextMessages getTextMessages() {
        return textMessages;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void runMainMenu() {
        boolean isProgramRunning = true;

        runCreateCompanyModule();

        while (isProgramRunning) {
            getPrinter().print(textMessages.getEmptyMessage());
            getPrinter().print(textMessages.getWelcomeMessage());
            getPrinter().print(textMessages.getEmptyMessage());
            getPrinter().print(textMessages.getMainMenuMessage());


            String choice = getScanner().next();

            switch (choice) {
                case "1":
                    runCompanyModule();
                    break;
                case "2":
                    runEmployeeModule();
                    break;
                case "3":
                    runFinancialAssetsModule();
                    break;
                case "4":
                    runAssetsModule();
                    break;
                case "5":
                    getPrinter().print(textMessages.getExitMessageProgram());
                    isProgramRunning = false;
                    break;
                default:
                    getPrinter().print(textMessages.getUnknownInputMessage());
                    break;
            }
        }
    }


    public void runCompanyModule() {

        boolean isCompanyModuleRunning = true;
        while (isCompanyModuleRunning) {

            getPrinter().print(textMessages.getEmptyMessage());
            getPrinter().print(textMessages.getCompanyModuleMessage());

            String choice = getScanner().next();

            switch (choice) {
                case "1":
                    companyManager.printAllCompanyInformation(company);
                    break;
                case "2":
                    runChangeCompanyNameSubmodule();
                    break;
                case "3":
                    runChangeCompanyHeadquatersSubmodule();
                    break;
                case "4":
                    runChangeCompanyAdressSubmodule();
                    break;
                case "5":
                    runChangeCompanyStartUpCapitalSubmodule();
                    break;
                case "6":
                    getPrinter().print(textMessages.getExitMessageCompanyModule());
                    isCompanyModuleRunning = false;
                    break;
                default:
                    getPrinter().print(textMessages.getUnknownInputMessage());
                    break;
            }
        }
    }

    public void runEmployeeModule() {

        boolean isEmployeeModuleRunning = true;
        while (isEmployeeModuleRunning) {

            getPrinter().print(textMessages.getEmptyMessage());
            getPrinter().print(textMessages.getEmployeeModuleMessage());

            String choice = getScanner().next();

            switch (choice) {
                case "1":
                    runAddEmployeeSubmodule();
                    break;
                case "2":
                    employeeManager.printAllEmployeeInformation(company);
                    break;
                case "3":
                    runRemoveEmployeeSubmodule();
                    break;
                case "4":
                    runChangeEmployeePositionSubmodule();
                    break;
                case "5":
                    runChangeEmployeeSalarySubmodule();
                    break;
                case "6":
                    getPrinter().print(textMessages.getExitMessageEmployeeModule());
                    isEmployeeModuleRunning = false;
                    break;
                default:
                    getPrinter().print(textMessages.getUnknownInputMessage());
                    break;
            }
        }
    }

    public void runFinancialAssetsModule() {

        boolean isFinancialAssetsModuleRunning = true;

        while (isFinancialAssetsModuleRunning) {

            getPrinter().print(textMessages.getEmptyMessage());
            getPrinter().print(textMessages.getFinancialAssetsModuleMessage());

            String choice = getScanner().next();

            switch (choice) {
                case "1":
                    runShowAllFinancialAssetsSubmodule();
                    break;
                case "2":
                    runAddFinancialAssetsSubmodule();
                    break;
                case "3":
                    runRemoveFinancialAssetsSubmodule();
                    break;
                case "4":
                    runPayRemunerationSubmodule();
                    break;
                case "5":
                    runDepreciationRateSubmodule();
                    break;
                case "6":
                    getPrinter().print(textMessages.getExitMessageFinancialAssetsModule());
                    isFinancialAssetsModuleRunning = false;
                    break;
                default:
                    getPrinter().print(textMessages.getUnknownInputMessage());
                    break;
            }
        }
    }

    public void runAssetsModule() {


        boolean isAssetsModuleRunning = true;

        while (isAssetsModuleRunning) {

            getPrinter().print(textMessages.getEmptyMessage());
            getPrinter().print(textMessages.getAssetsModuleMessage());
            String choice = getScanner().next();

            switch (choice) {
                case "1":
                    runShowAllAssetsSubmodule();
                    break;
                case "2":
                    runAddAssetSubmodule();
                    break;
                case "3":
                    runRemoveAssetSubmodule();
                    break;
                case "4":
                    getPrinter().print(textMessages.getExitMessageAssetsModule());
                    isAssetsModuleRunning = false;
                    break;
                default:
                    getPrinter().print(textMessages.getUnknownInputMessage());
                    break;
            }
        }
    }

    public void runCreateCompanyModule() {
        getPrinter().print(textMessages.getCreateCompanyModuleMessage());
        getPrinter().print(textMessages.getCreateCompanyName());
        String companyName = getScanner().next();
        getPrinter().print(textMessages.getCreateCompanyHeadquaters());
        String companyHeadquaters = getScanner().next();
        getPrinter().print(textMessages.getCreateCompanyAdress());
        String companyAdress = getScanner().next();
        getPrinter().print(textMessages.getCreateCompanyStartUpCapital());
        String companyStartUpCapital = getScanner().next();
        company = companyManager.createCompany(companyName, companyHeadquaters, companyAdress, Double.valueOf(companyStartUpCapital));
        getPrinter().print(textMessages.getCompanyWasCreated());

    }

    public void loadCompanyFromFileModule() {

    }

    public void runChangeCompanyNameSubmodule() {
        getPrinter().print(textMessages.getChangeCompanyName());
        String newCompanyName = getScanner().next();
        companyManager.changeCompanyName(company, newCompanyName);
        getPrinter().print(textMessages.getCompanyNameWasChanged());
    }

    public void runChangeCompanyHeadquatersSubmodule() {
        getPrinter().print(textMessages.getChangeCompanyHeadquaters());
        String newCompanyHeadquaters = getScanner().next();
        companyManager.changeCompanyHeadquaters(company, newCompanyHeadquaters);
        getPrinter().print(textMessages.getCompanyHeadquatersWasChanged());
    }

    public void runChangeCompanyAdressSubmodule() {
        getPrinter().print(textMessages.getChangeCompanyAdress());
        String newCompanyAdress = getScanner().next();
        companyManager.changeCompanyAdress(company, newCompanyAdress);
        getPrinter().print(textMessages.getCompanyAdressWasChanged());
    }

    public void runChangeCompanyStartUpCapitalSubmodule() {
        getPrinter().print(textMessages.getChangeCompanyStartUpCapital());
        String newCompanyStartUpCapital = getScanner().next();
        companyManager.changeCompanyStartUpCapital(company, Double.valueOf(newCompanyStartUpCapital));
        getPrinter().print(textMessages.getCompanyStartUpCapitalWasChanged());
    }

    public void runAddEmployeeSubmodule() {
        getPrinter().print(textMessages.getEnterEmployeeName());
        String employeeName = getScanner().next();
        getPrinter().print(textMessages.getEnterEmployeeLastName());
        String employeeLastName = getScanner().next();
        getPrinter().print(textMessages.getEnterEmployeeAge());
        int employeeAge = Integer.valueOf(getScanner().next());
        getPrinter().print(textMessages.getEnterEmployeeSalary());
        double employeeSalary = Double.valueOf(getScanner().next());
        getPrinter().print(textMessages.getEnterEmployeePosition());
        String employeePosition = getScanner().next();
        employeeManager.addEmployee(company, employeeManager.createEmployee(employeeName, employeeLastName, employeeAge, employeeSalary, employeePosition));
        getPrinter().print(textMessages.getEmployeeWasAdded());
    }

    public void runRemoveEmployeeSubmodule() {
        getPrinter().print(textMessages.getEnterEmployeeNameToRemove());
        String employeeName = getScanner().next();
        getPrinter().print(textMessages.getEnterEmployeeLastNameToRemove());
        String employeeLastName = getScanner().next();

        if (employeeManager.isEmployeeOnList(company, employeeName, employeeLastName)) {
            employeeManager.removeEmployee(company, employeeName, employeeLastName);
            getPrinter().print(textMessages.getEmployeeWasRemoved());
        } else {
            getPrinter().print(textMessages.getCannotRemoveEmployee());
        }
    }

    public void runChangeEmployeePositionSubmodule() {
        getPrinter().print(textMessages.getEnterEmployeeNameToChangePosition());
        String employeeName = getScanner().next();
        getPrinter().print(textMessages.getEnterEmployeeLastNameToChangePosition());
        String employeeLastName = getScanner().next();
        getPrinter().print(textMessages.getEnterEmployeePosition());
        String newPosition = getScanner().next();

        if (employeeManager.isEmployeeOnList(company, employeeName, employeeLastName)) {
            employeeManager.changeEmployeePosition(company, employeeName, employeeLastName, newPosition);
            getPrinter().print(textMessages.getEmployeePositionWasChanged());

        } else {
            getPrinter().print(textMessages.getCannotChangeEmployeePosition());
        }
    }

    public void runChangeEmployeeSalarySubmodule() {
        getPrinter().print(textMessages.getEnterEmployeeNameToChangeSalary());
        String employeeName = getScanner().next();
        getPrinter().print(textMessages.getEnterEmployeeLastNameToChangeSalary());
        String employeeLastName = getScanner().next();
        getPrinter().print(textMessages.getEnterEmployeeSalary());
        double newSalary = Double.valueOf(getScanner().next());

        if (employeeManager.isEmployeeOnList(company, employeeName, employeeLastName)) {
            employeeManager.changeEmployeeSalary(company, employeeName, employeeLastName, newSalary);
            getPrinter().print(textMessages.getEmployeeSalaryWasChanged());

        } else {
            getPrinter().print(textMessages.getCannotChangeEmployeeSalary());
        }
    }

    public void runShowAllFinancialAssetsSubmodule() {
        getPrinter().print(textMessages.getShowAllFinancialAssets());
        getPrinter().print(String.valueOf(financialAssetsManager.calculateFinancialAssetsTotalValue(company)));
        getPrinter().print(textMessages.getShowAllAssetsValue());
        getPrinter().print(String.valueOf(financialAssetsManager.calculateAssetsTotalValue(company)));
        getPrinter().print(textMessages.getShowAssetsAndFinancialAssetsValue());
        getPrinter().print(String.valueOf(financialAssetsManager.calcuateAssetsAndFinancialAssetsTotalValue(company)));
    }

    public void runAddFinancialAssetsSubmodule() {
        getPrinter().print(textMessages.getEnterMoneyAmountToAdd());
        double cashValue = getScanner().nextDouble();
        financialAssetsManager.addFinancialAsset(company, cashValue);
        getPrinter().print(textMessages.getMoneyAmountWasAdded());
    }

    public void runRemoveFinancialAssetsSubmodule() {
        getPrinter().print(textMessages.getEnterMoneyAmountToRemove());
        double cashValue = getScanner().nextDouble();

        if (financialAssetsManager.canCompanySpendCash(company, cashValue)) {
            financialAssetsManager.removeFinancialAsset(company, cashValue);
            getPrinter().print(textMessages.getMoneyAmountWasRemoved());
        } else {
            getPrinter().print(textMessages.getNotEnoughFunds());
        }
    }

    public void runPayRemunerationSubmodule() {

        if (financialAssetsManager.canCompanyPayRemuneration(company, financialAssetsManager.calculateTotalRemuneration(company))) {
            financialAssetsManager.payRemuneration(company);
            getPrinter().print(textMessages.getSuccesfulPaymentOfRemuneration());
        } else {
            getPrinter().print(textMessages.getNotEnoughFunds());
        }
    }

    public void runDepreciationRateSubmodule() {
        if (financialAssetsManager.canCompanyCalculateDepreciationRate(company)) {
            financialAssetsManager.calculateDepreciationRate(company);
            getPrinter().print(textMessages.getDepreciationRateWasCalculated());

        } else {
            getPrinter().print(textMessages.getCannotCalculateDepreciationRate());
        }

    }

    public void runShowAllAssetsSubmodule() {
        getPrinter().print(textMessages.getShowAllAssets());
        assetManager.printAllAssetInformation(company);
    }

    public void runAddAssetSubmodule() {
        getPrinter().print(textMessages.getEnterAssetName());
        String assetName = getScanner().next();
        getPrinter().print(textMessages.getEnterAssetType());
        String assetType = getScanner().next();
        getPrinter().print(textMessages.getEnterAssetValue());
        double assetValue = Double.valueOf(getScanner().next());
        getPrinter().print(textMessages.getEnterAssetDepreciationRate());
        int assetDepreciationRate = Integer.valueOf(getScanner().next());
        assetManager.addAsset(company, assetManager.createAsset(assetName, assetType, assetValue, assetDepreciationRate));
        getPrinter().print(textMessages.getAssetWasAdded());
    }

    public void runRemoveAssetSubmodule() {
        getPrinter().print(textMessages.getEnterAssetNameToRemove());
        String assetName = getScanner().next();
        getPrinter().print(textMessages.getEnterAssetTypeToRemove());
        String assetType = getScanner().next();
        getPrinter().print(textMessages.getEnterAssetValue());
        double assetValue = Double.valueOf(getScanner().next());
        getPrinter().print(textMessages.getEnterAssetDepreciationRate());
        int assetDepreciationRate = Integer.valueOf(getScanner().next());

        if (assetManager.isAssetOnAList(company, assetName, assetType, assetValue, assetDepreciationRate)) {
            assetManager.removeAsset(company, assetName, assetType, assetValue, assetDepreciationRate);
            getPrinter().print(textMessages.getAssetWasRemoved());
        } else {
            getPrinter().print(textMessages.getCannotRemoveAsset());
        }
    }
}

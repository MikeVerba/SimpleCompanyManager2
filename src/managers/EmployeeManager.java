package managers;


import companyModules.Company;
import companyModules.Employee;

public class EmployeeManager extends Manager {
    public void addEmployee(Company company, Employee employee) {
        company.getEmployeeList().add(employee);
    }

    public void removeEmployee(Company company, String employeeName, String employeeLastName) {

        for (int i = 0; i < company.getEmployeeList().size(); i++) {
            if (company.getEmployeeList().get(i).getName().equals(employeeName) && company.getEmployeeList().get(i).getLastName().equals(employeeLastName)) {
                company.getEmployeeList().remove(company.getEmployeeList().get(i));
            }
        }
    }

    public boolean isEmployeeOnList(Company company, String employeeName, String employeeLastName) {

        for (int i = 0; i < company.getEmployeeList().size(); i++) {
            if (company.getEmployeeList().get(i).getName().equals(employeeName) && company.getEmployeeList().get(i).getLastName().equals(employeeLastName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmployeeListEmpty(Company company, Employee employee) {
        return company.getEmployeeList().isEmpty();
    }

    public void changeEmployeePosition(Company company, String employeeName, String employeeLastName, String newPosition) {
        for (int i = 0; i < company.getEmployeeList().size(); i++) {
            if (company.getEmployeeList().get(i).getName().equals(employeeName) && company.getEmployeeList().get(i).getLastName().equals(employeeLastName)) {
                company.getEmployeeList().get(i).setPosition(newPosition);
            }
        }
    }

    public void changeEmployeeSalary(Company company, String employeeName, String employeeLastName, double newSalary) {
        for (int i = 0; i < company.getEmployeeList().size(); i++) {
            if (company.getEmployeeList().get(i).getName().equals(employeeName) && company.getEmployeeList().get(i).getLastName().equals(employeeLastName)) {
                company.getEmployeeList().get(i).setSalary(newSalary);
            }
        }
    }

    public void printEmployeeInformation(Company company, Employee employee) {
        int employeeIndex = company.getEmployeeList().indexOf(employee);
        String employeeName = company.getEmployeeList().get(employeeIndex).getName();
        String employeeLastName = company.getEmployeeList().get(employeeIndex).getLastName();
        String employeeAge = String.valueOf(company.getEmployeeList().get(employeeIndex).getAge());
        String employeePosition = company.getEmployeeList().get(employeeIndex).getPosition();
        String emmployeeSalary = String.valueOf(company.getEmployeeList().get(employeeIndex).getSalary());

        getPrinter().print("");
        getPrinter().print("****INFORMACJE O PRACOWNIKU****");
        getPrinter().print("Imię: " + employeeName);
        getPrinter().print("Nazwisko: " + employeeLastName);
        getPrinter().print("Wiek: " + employeeAge);
        getPrinter().print("Pozycja: " + employeePosition);
        getPrinter().print("Pensja: " + emmployeeSalary);
    }

    public void printAllEmployeeInformation(Company company) {

        for (int i = 0; i < company.getEmployeeList().size(); i++) {
            printEmployeeInformation(company, company.getEmployeeList().get(i));
        }
    }

    public Employee createEmployee(String name, String lastName, int age, double salary, String position) {
        return new Employee(name, lastName, age, salary, position);
    }

}

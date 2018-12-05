package menu;

public class TextMessages {
    private String emptyMessage = "";
    private String unknownInputMessage = "Niewłaściwe dane. Podaj właściwe dane.";
    private String welcomeMessage = "****Witaj w programie do zarządzania Twoją firmą****";
    private String mainMenuMessage = "Wpisz wybrany numer modułu: \n" +
            "1. Zarządzanie firmą \n" +
            "2. Zarzadzanie pracownikami \n" +
            "3. Zarządzanie majątkiem \n" +
            "4. Zarządzanie sprzętem firmy \n" +
            "5. Wyjdź z programu";
    private String companyModuleMessage = "Wybierz : \n" +
            "1. Informacje o firmie \n" +
            "2. Zmiana nazwy firmy \n" +
            "3. Zmiana siedziby firmy  \n" +
            "4. Zmiana adresu firmy \n" +
            "5. Zmiana majątku początkowego \n" +
            "6. Wyjdź z modułu zarządzanie firmą";
    private String employeeModuleMessage = "Wybierz : \n" +
            "1. Dodaj pracownika \n" +
            "2. Wyświetlanie pracowników \n" +
            "3. Usuń pracownika  \n" +
            "4. Zmień fukcje pracownika \n" +
            "5. Zmień pensję pracownika \n" +
            "6. Wyjdź z modułu pracownicy";
    private String financialAssetsModuleMessage = "Wybierz : \n" +
            "1. Zobacz wszystkie środki pieniężne.\n" +
            "2. Dodaj środki pieniężne\n" +
            "3. Usuń środki pieniężne \n" +
            "4. Wypłata wynagrodzeń \n" +
            "5. Amortyzacja sprzętu \n" +
            "6. Wyjdź z modułu zarządzanie środkami finansowymi";
    private String assetsModuleMessage = "Wybierz : \n" +
            "1. Wyświetl wszystkie sprzęty \n" +
            "2. Dodaj nowy sprzęt \n" +
            "3. Usuń sprzęt \n" +
            "4. Wyjdź z modułu zarządzanie sprzętem firmy";
    private String createCompanyModuleMessage = "Witaj w module tworzenia swojej firmy.";
    private String createCompanyName = "Podaj nazwę firmy: ";
    private String createCompanyHeadquaters = "Podaj siedzibę firmy";
    private String createCompanyAdress = "Podaj adres firmy";
    private String createCompanyStartUpCapital = "Podaj majątek początkowy firmy";
    private String companyWasCreated = "Utworzono nową firmę!";


    private String exitMessageProgram = "Program zostanie zamknięty.\n" +
            "Dziękujemy za korzystanie z naszego programu.";

    private String changeCompanyName = "Podaj nową nazwę firmy: ";
    private String companyNameWasChanged = "Nazwa firmy została zmieniona.";

    private String changeCompanyHeadquaters = "Podaj nową siedzibę firmy: ";
    private String companyHeadquatersWasChanged = "Siedziba firmy została zmieniona.";

    private String changeCompanyAdress = "Podaj nowy adres firmy: ";
    private String companyAdressWasChanged = "Adres firmy został zmieniony.";

    private String changeCompanyStartUpCapital = "Podaj nowy majątek początkowy firmy: ";
    private String companyStartUpCapitalWasChanged = "Majątek początkowy firmy został zmieniony";

    private String exitMessageCompanyModule = "Moduł zarządzania firmą został zamknięty";

    private String enterEmployeeName = "Podaj imię pracownika: ";
    private String enterEmployeeLastName = "Podaj nazwisko pracownika: ";
    private String enterEmployeeAge = "Podaj wiek pracownika: ";
    private String enterEmployeeSalary = "Podaj pensję pracownika: ";
    private String enterEmployeePosition = "Podaj funkcję pracownika: ";
    private String employeeWasAdded = "Nowy pracownik został dodany.";

    private String enterEmployeeNameToRemove = "Podaj imię pracownika, którego chcesz usunąć: ";
    private String enterEmployeeLastNameToRemove = "Podaj nazwisko pracownika, którego chcesz usunąć: ";
    private String cannotRemoveEmployee = "Nie można usunąć tego pracownika, ponieważ nie ma go na liście.";
    private String employeeWasRemoved = "Pracownik został usunięty z listy pracowników.";

    private String enterEmployeeNameToChangePosition = "Podaj imię pracownika, któremu chcesz zmienić funkcje: ";
    private String enterEmployeeLastNameToChangePosition = "Podaj nazwisko pracownika, któremu chcesz zmienić funkcje: ";
    private String cannotChangeEmployeePosition = "Nie można zmienić funkcji pracownika, ponieważ nie ma go na liście.";
    private String employeePositionWasChanged = "Funkcja pracownika została zmieniona.";

    private String enterEmployeeNameToChangeSalary = "Podaj imię pracownika, któremu chcesz zmienić pensje: ";
    private String enterEmployeeLastNameToChangeSalary = "Podaj nazwisko pracownika, któremu chcesz zmienić pensje: ";
    private String cannotChangeEmployeeSalary = "Nie można zmienić pensji pracownika, ponieważ nie ma go na liście.";
    private String employeeSalaryWasChanged = "Pensja pracownika została zmieniona.";

    private String exitMessageEmployeeModule = "Moduł zarządzania pracownikami został zamknięty";

    private String showAllFinancialAssets = "Środki pieniężne Twojej fimy: ";
    private String showAllAssetsValue = "Środki trwałe Twojej fimy: ";
    private String showAssetsAndFinancialAssetsValue = "Środki pieniężne i trwałe Twojej fimy: ";

    private String enterMoneyAmountToAdd = "Podaj kwotę, którą chcesz dodać: ";
    private String moneyAmountWasAdded = "Kwota została pomyślnie dodana.";

    private String enterMoneyAmountToRemove = "Podaj kwotę, którą chcesz odjąć: ";
    private String moneyAmountWasRemoved = "Kwota została pomyślnie odjęta.";

    private String notEnoughFunds = "Nie masz wystarczjącej ilości środków na koncie.";

    private String succesfulPaymentOfRemuneration = "Wypłacono wynagrodzenia.";

    private String depreciationRateWasCalculated = "Stopa amortyzacji została odliczona";
    private String cannotCalculateDepreciationRate = "Brak środków trwałych w firmie - nie możesz policzyć stopy amortyzacji";

    private String exitMessageFinancialAssetsModule = "Moduł zarządzania majątkiem został zamknięty";

    private String showAllAssets = "Środki trwałe Twojej fimy: ";

    private String enterAssetName = "Podaj nazwę sprzętu: ";
    private String enterAssetType = "Podaj typ sprzętu: ";
    private String enterAssetValue = "Podaj wartość sprzętu: ";
    private String enterAssetDepreciationRate = "Podaj stopę amortyzacji: ";
    private String assetWasAdded = "Nowy sprzęt został dodany.";

    private String enterAssetNameToRemove = "Podaj nazwę sprzętu, który chcesz usunąć: ";
    private String enterAssetTypeToRemove = "Podaj typ sprzętu, który chcesz usunąć: ";
    private String assetWasRemoved = "Sprzęt został usuniety.";
    private String cannotRemoveAsset = "Nie można usunąć sprzętu. Nie ma go na liście.";

    private String exitMessageAssetsModule = "Moduł zarządzania sprzętem został zamknięty";

    public String getEmptyMessage() {
        return emptyMessage;
    }

    public String getUnknownInputMessage() {
        return unknownInputMessage;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    public String getMainMenuMessage() {
        return mainMenuMessage;
    }

    public String getCompanyModuleMessage() {
        return companyModuleMessage;
    }

    public String getEmployeeModuleMessage() {
        return employeeModuleMessage;
    }

    public String getFinancialAssetsModuleMessage() {
        return financialAssetsModuleMessage;
    }

    public String getAssetsModuleMessage() {
        return assetsModuleMessage;
    }

    public String getExitMessageProgram() {
        return exitMessageProgram;
    }

    public String getChangeCompanyName() {
        return changeCompanyName;
    }

    public String getCompanyNameWasChanged() {
        return companyNameWasChanged;
    }

    public String getChangeCompanyHeadquaters() {
        return changeCompanyHeadquaters;
    }

    public String getCompanyHeadquatersWasChanged() {
        return companyHeadquatersWasChanged;
    }

    public String getChangeCompanyAdress() {
        return changeCompanyAdress;
    }

    public String getCompanyAdressWasChanged() {
        return companyAdressWasChanged;
    }

    public String getChangeCompanyStartUpCapital() {
        return changeCompanyStartUpCapital;
    }

    public String getCompanyStartUpCapitalWasChanged() {
        return companyStartUpCapitalWasChanged;
    }

    public String getExitMessageCompanyModule() {
        return exitMessageCompanyModule;
    }

    public String getCreateCompanyModuleMessage() {
        return createCompanyModuleMessage;
    }

    public String getCreateCompanyName() {
        return createCompanyName;
    }

    public String getCreateCompanyHeadquaters() {
        return createCompanyHeadquaters;
    }

    public String getCreateCompanyAdress() {
        return createCompanyAdress;
    }

    public String getCreateCompanyStartUpCapital() {
        return createCompanyStartUpCapital;
    }

    public String getCompanyWasCreated() {
        return companyWasCreated;
    }

    public String getEnterEmployeeName() {
        return enterEmployeeName;
    }

    public String getEnterEmployeeLastName() {
        return enterEmployeeLastName;
    }

    public String getEnterEmployeeAge() {
        return enterEmployeeAge;
    }

    public String getEnterEmployeePosition() {
        return enterEmployeePosition;
    }

    public String getEnterEmployeeSalary() {
        return enterEmployeeSalary;
    }

    public String getEmployeeWasAdded() {
        return employeeWasAdded;
    }

    public String getEnterEmployeeNameToRemove() {
        return enterEmployeeNameToRemove;
    }

    public String getEnterEmployeeLastNameToRemove() {
        return enterEmployeeLastNameToRemove;
    }

    public String getCannotRemoveEmployee() {
        return cannotRemoveEmployee;
    }

    public String getEmployeeWasRemoved() {
        return employeeWasRemoved;
    }

    public String getEnterEmployeeNameToChangePosition() {
        return enterEmployeeNameToChangePosition;
    }

    public String getEnterEmployeeLastNameToChangePosition() {
        return enterEmployeeLastNameToChangePosition;
    }

    public String getCannotChangeEmployeePosition() {
        return cannotChangeEmployeePosition;
    }

    public String getEmployeePositionWasChanged() {
        return employeePositionWasChanged;
    }

    public String getEnterEmployeeNameToChangeSalary() {
        return enterEmployeeNameToChangeSalary;
    }

    public String getEnterEmployeeLastNameToChangeSalary() {
        return enterEmployeeLastNameToChangeSalary;
    }

    public String getCannotChangeEmployeeSalary() {
        return cannotChangeEmployeeSalary;
    }

    public String getEmployeeSalaryWasChanged() {
        return employeeSalaryWasChanged;
    }

    public String getExitMessageEmployeeModule() {
        return exitMessageEmployeeModule;
    }

    public String getShowAllFinancialAssets() {
        return showAllFinancialAssets;
    }

    public String getShowAllAssetsValue() {
        return showAllAssetsValue;
    }

    public String getShowAssetsAndFinancialAssetsValue() {
        return showAssetsAndFinancialAssetsValue;
    }

    public String getEnterMoneyAmountToAdd() {
        return enterMoneyAmountToAdd;
    }

    public String getMoneyAmountWasAdded() {
        return moneyAmountWasAdded;
    }

    public String getEnterMoneyAmountToRemove() {
        return enterMoneyAmountToRemove;
    }

    public String getMoneyAmountWasRemoved() {
        return moneyAmountWasRemoved;
    }

    public String getNotEnoughFunds() {
        return notEnoughFunds;
    }

    public String getSuccesfulPaymentOfRemuneration() {
        return succesfulPaymentOfRemuneration;
    }

    public String getDepreciationRateWasCalculated() {
        return depreciationRateWasCalculated;
    }

    public String getCannotCalculateDepreciationRate() {
        return cannotCalculateDepreciationRate;
    }

    public String getExitMessageFinancialAssetsModule() {
        return exitMessageFinancialAssetsModule;
    }

    public String getShowAllAssets() {
        return showAllAssets;
    }

    public String getEnterAssetName() {
        return enterAssetName;
    }

    public String getEnterAssetType() {
        return enterAssetType;
    }

    public String getEnterAssetValue() {
        return enterAssetValue;
    }

    public String getEnterAssetDepreciationRate() {
        return enterAssetDepreciationRate;
    }

    public String getAssetWasAdded() {
        return assetWasAdded;
    }

    public String getEnterAssetNameToRemove() {
        return enterAssetNameToRemove;
    }

    public String getEnterAssetTypeToRemove() {
        return enterAssetTypeToRemove;
    }

    public String getAssetWasRemoved() {
        return assetWasRemoved;
    }

    public String getCannotRemoveAsset() {
        return cannotRemoveAsset;
    }

    public String getExitMessageAssetsModule() {
        return exitMessageAssetsModule;
    }
}

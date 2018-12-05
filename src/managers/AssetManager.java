package managers;

import companyModules.Asset;
import companyModules.Company;

public class AssetManager extends Manager {
    public void addAsset(Company company, Asset asset) {
        company.getAssetList().add(asset);
    }

    public boolean isAssetOnAList(Company company, String assetName, String assetType, double assetValue, int assetDepreciationRate) {
        return company.getAssetList().contains(createAsset(assetName, assetType, assetValue, assetDepreciationRate));
    }

    public void removeAsset(Company company, String assetName, String assetType, double assetValue, int assetDepreciationRate) {
        company.getAssetList().remove(createAsset(assetName, assetType, assetValue, assetDepreciationRate));
    }

    public boolean isAssetListEmpty(Company company) {
        return company.getAssetList().isEmpty();
    }

    public void printAssetInformation(Company company, Asset asset) {
        int assetIndex = company.getAssetList().indexOf(asset);
        String assetName = company.getAssetList().get(assetIndex).getAssetName();
        String assetType = company.getAssetList().get(assetIndex).getAssetType();
        String assetValue = String.valueOf(company.getAssetList().get(assetIndex).getAssetValue());
        String assetDepreciationRate = String.valueOf(company.getAssetList().get(assetIndex).getAssetDepreciationRate());

        getPrinter().print("");
        getPrinter().print("****INFORMACJE O SPRZĘCIE****");
        getPrinter().print("Nazwa: " + assetName);
        getPrinter().print("Typ: " + assetType);
        getPrinter().print("Wartość: " + assetValue);
        getPrinter().print("Stopa oprocentowania: " + assetDepreciationRate);
    }

    public void printAllAssetInformation(Company company) {

        if (isAssetListEmpty(company)) {
            getPrinter().print("");
            getPrinter().print("Firma nie posiada majątku trwałego.");
            getPrinter().print("");

        } else {
            for (int i = 0; i < company.getAssetList().size(); i++) {
                printAssetInformation(company, company.getAssetList().get(i));
            }
        }
    }

    public Asset createAsset(String assetName, String assetType, double assetValue, int assetDepreciationRate) {
        return new Asset(assetName, assetType, assetValue, assetDepreciationRate);
    }
}

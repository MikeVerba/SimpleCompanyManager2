package companyModules;

import java.util.Objects;

public class Asset {
    private String assetName;
    private String assetType;
    private double assetValue;
    private int assetDepreciationRate;

    public Asset(String assetName, String assetType, double assetValue, int assetDepreciationRate) {
        this.assetName = assetName;
        this.assetType = assetType;
        this.assetValue = assetValue;
        this.assetDepreciationRate = assetDepreciationRate;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public double getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(double assetValue) {
        this.assetValue = assetValue;
    }

    public int getAssetDepreciationRate() {
        return assetDepreciationRate;
    }

    public void setAssetDepreciationRate(int assetDepreciationRate) {
        this.assetDepreciationRate = assetDepreciationRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asset asset = (Asset) o;
        return Double.compare(asset.assetValue, assetValue) == 0 &&
                assetDepreciationRate == asset.assetDepreciationRate &&
                Objects.equals(assetName, asset.assetName) &&
                Objects.equals(assetType, asset.assetType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(assetName, assetType, assetValue, assetDepreciationRate);
    }
}


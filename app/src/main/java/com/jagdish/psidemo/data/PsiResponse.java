package com.jagdish.psidemo.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PsiResponse {

    @SerializedName("api_info")
    @Expose
    private ApiInfo apiInfo;

    @SerializedName("region_metadata")
    @Expose
    private List<RegionMetaData> regionMetaData = null;

    @SerializedName("items")
    @Expose
    private List<Items> items = null;

    public ApiInfo getApiInfo() {
        return apiInfo;
    }

    public void setApiInfo(ApiInfo apiInfo) {
        this.apiInfo = apiInfo;
    }

    public List<RegionMetaData> getRegionMetaData() {
        return regionMetaData;
    }

    public void setRegionMetaData(List<RegionMetaData> regionMetaData) {
        this.regionMetaData = regionMetaData;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }
}

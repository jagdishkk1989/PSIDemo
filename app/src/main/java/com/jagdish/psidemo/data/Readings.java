package com.jagdish.psidemo.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Readings {

    @SerializedName("o3_sub_index")
    @Expose
    private Reading o3_sub_index;

    @SerializedName("pm10_twenty_four_hourly")
    @Expose
    private Reading pm10_twenty_four_hourly;

    @SerializedName("pm10_sub_index")
    @Expose
    private Reading pm10_sub_index;

    @SerializedName("co_sub_index")
    @Expose
    private Reading co_sub_index;

    @SerializedName("pm25_twenty_four_hourly")
    @Expose
    private Reading pm25_twenty_four_hourly;

    @SerializedName("so2_sub_index")
    @Expose
    private Reading so2_sub_index;

    @SerializedName("co_eight_hour_max")
    @Expose
    private Reading co_eight_hour_max;

    @SerializedName("no2_one_hour_max")
    @Expose
    private Reading no2_one_hour_max;

    @SerializedName("so2_twenty_four_hourly")
    @Expose
    private Reading so2_twenty_four_hourly;

    @SerializedName("pm25_sub_index")
    @Expose
    private Reading pm25_sub_index;

    @SerializedName("psi_twenty_four_hourly")
    @Expose
    private Reading psi_twenty_four_hourly;

    @SerializedName("o3_eight_hour_max")
    @Expose
    private Reading o3_eight_hour_max;

    public Reading getO3_sub_index() {
        return o3_sub_index;
    }

    public void setO3_sub_index(Reading o3_sub_index) {
        this.o3_sub_index = o3_sub_index;
    }

    public Reading getPm10_twenty_four_hourly() {
        return pm10_twenty_four_hourly;
    }

    public void setPm10_twenty_four_hourly(Reading pm10_twenty_four_hourly) {
        this.pm10_twenty_four_hourly = pm10_twenty_four_hourly;
    }

    public Reading getPm10_sub_index() {
        return pm10_sub_index;
    }

    public void setPm10_sub_index(Reading pm10_sub_index) {
        this.pm10_sub_index = pm10_sub_index;
    }

    public Reading getCo_sub_index() {
        return co_sub_index;
    }

    public void setCo_sub_index(Reading co_sub_index) {
        this.co_sub_index = co_sub_index;
    }

    public Reading getPm25_twenty_four_hourly() {
        return pm25_twenty_four_hourly;
    }

    public void setPm25_twenty_four_hourly(Reading pm25_twenty_four_hourly) {
        this.pm25_twenty_four_hourly = pm25_twenty_four_hourly;
    }

    public Reading getSo2_sub_index() {
        return so2_sub_index;
    }

    public void setSo2_sub_index(Reading so2_sub_index) {
        this.so2_sub_index = so2_sub_index;
    }

    public Reading getCo_eight_hour_max() {
        return co_eight_hour_max;
    }

    public void setCo_eight_hour_max(Reading co_eight_hour_max) {
        this.co_eight_hour_max = co_eight_hour_max;
    }

    public Reading getNo2_one_hour_max() {
        return no2_one_hour_max;
    }

    public void setNo2_one_hour_max(Reading no2_one_hour_max) {
        this.no2_one_hour_max = no2_one_hour_max;
    }

    public Reading getSo2_twenty_four_hourly() {
        return so2_twenty_four_hourly;
    }

    public void setSo2_twenty_four_hourly(Reading so2_twenty_four_hourly) {
        this.so2_twenty_four_hourly = so2_twenty_four_hourly;
    }

    public Reading getPm25_sub_index() {
        return pm25_sub_index;
    }

    public void setPm25_sub_index(Reading pm25_sub_index) {
        this.pm25_sub_index = pm25_sub_index;
    }

    public Reading getPsi_twenty_four_hourly() {
        return psi_twenty_four_hourly;
    }

    public void setPsi_twenty_four_hourly(Reading psi_twenty_four_hourly) {
        this.psi_twenty_four_hourly = psi_twenty_four_hourly;
    }

    public Reading getO3_eight_hour_max() {
        return o3_eight_hour_max;
    }

    public void setO3_eight_hour_max(Reading o3_eight_hour_max) {
        this.o3_eight_hour_max = o3_eight_hour_max;
    }

    public String getWestValue() {
        String value = "o3_sub_index: " + o3_sub_index.getWest() + "\n" +
                "pm10_twenty_four_hourly: " + pm10_twenty_four_hourly.getWest() + "\n" +
                "pm10_sub_index: " + pm10_sub_index.getWest() + "\n" +
                "co_sub_index: " + co_sub_index.getWest() + "\n" +
                "pm25_twenty_four_hourly: " + pm25_twenty_four_hourly.getWest() + "\n" +
                "so2_sub_index: " + so2_sub_index.getWest() + "\n" +
                "co_eight_hour_max: " + co_eight_hour_max.getWest() + "\n" +
                "no2_one_hour_max: " + no2_one_hour_max.getWest() + "\n" +
                "so2_twenty_four_hourly: " + so2_twenty_four_hourly.getWest() + "\n" +
                "pm25_sub_index: " + pm25_sub_index.getWest() + "\n" +
                "psi_twenty_four_hourly: " + psi_twenty_four_hourly.getWest() + "\n" +
                "o3_eight_hour_max: " + psi_twenty_four_hourly.getWest() + "\n";

        return value;
    }

    public String getNationalValue() {
        String value = "o3_sub_index: " + o3_sub_index.getNational() + "\n" +
                "pm10_twenty_four_hourly: " + pm10_twenty_four_hourly.getNational() + "\n" +
                "pm10_sub_index: " + pm10_sub_index.getNational() + "\n" +
                "co_sub_index: " + co_sub_index.getNational() + "\n" +
                "pm25_twenty_four_hourly: " + pm25_twenty_four_hourly.getNational() + "\n" +
                "so2_sub_index: " + so2_sub_index.getNational() + "\n" +
                "co_eight_hour_max: " + co_eight_hour_max.getNational() + "\n" +
                "no2_one_hour_max: " + no2_one_hour_max.getNational() + "\n" +
                "so2_twenty_four_hourly: " + so2_twenty_four_hourly.getNational() + "\n" +
                "pm25_sub_index: " + pm25_sub_index.getNational() + "\n" +
                "psi_twenty_four_hourly: " + psi_twenty_four_hourly.getNational() + "\n" +
                "o3_eight_hour_max: " + psi_twenty_four_hourly.getNational() + "\n";

        return value;
    }

    public String getEastValue() {
        String value = "o3_sub_index: " + o3_sub_index.getEast() + "\n" +
                "pm10_twenty_four_hourly: " + pm10_twenty_four_hourly.getEast() + "\n" +
                "pm10_sub_index: " + pm10_sub_index.getEast() + "\n" +
                "co_sub_index: " + co_sub_index.getEast() + "\n" +
                "pm25_twenty_four_hourly: " + pm25_twenty_four_hourly.getEast() + "\n" +
                "so2_sub_index: " + so2_sub_index.getEast() + "\n" +
                "co_eight_hour_max: " + co_eight_hour_max.getEast() + "\n" +
                "no2_one_hour_max: " + no2_one_hour_max.getEast() + "\n" +
                "so2_twenty_four_hourly: " + so2_twenty_four_hourly.getEast() + "\n" +
                "pm25_sub_index: " + pm25_sub_index.getEast() + "\n" +
                "psi_twenty_four_hourly: " + psi_twenty_four_hourly.getEast() + "\n" +
                "o3_eight_hour_max: " + psi_twenty_four_hourly.getEast() + "\n";

        return value;
    }

    public String getCentralValue() {
        String value = "o3_sub_index: " + o3_sub_index.getCentral() + "\n" +
                "pm10_twenty_four_hourly: " + pm10_twenty_four_hourly.getCentral() + "\n" +
                "pm10_sub_index: " + pm10_sub_index.getCentral() + "\n" +
                "co_sub_index: " + co_sub_index.getCentral() + "\n" +
                "pm25_twenty_four_hourly: " + pm25_twenty_four_hourly.getCentral() + "\n" +
                "so2_sub_index: " + so2_sub_index.getCentral() + "\n" +
                "co_eight_hour_max: " + co_eight_hour_max.getCentral() + "\n" +
                "no2_one_hour_max: " + no2_one_hour_max.getCentral() + "\n" +
                "so2_twenty_four_hourly: " + so2_twenty_four_hourly.getCentral() + "\n" +
                "pm25_sub_index: " + pm25_sub_index.getCentral() + "\n" +
                "psi_twenty_four_hourly: " + psi_twenty_four_hourly.getCentral() + "\n" +
                "o3_eight_hour_max: " + psi_twenty_four_hourly.getCentral() + "\n";

        return value;
    }

    public String getSouthValue() {
        String value = "o3_sub_index: " + o3_sub_index.getSouth() + "\n" +
                "pm10_twenty_four_hourly: " + pm10_twenty_four_hourly.getSouth() + "\n" +
                "pm10_sub_index: " + pm10_sub_index.getSouth() + "\n" +
                "co_sub_index: " + co_sub_index.getSouth() + "\n" +
                "pm25_twenty_four_hourly: " + pm25_twenty_four_hourly.getSouth() + "\n" +
                "so2_sub_index: " + so2_sub_index.getSouth() + "\n" +
                "co_eight_hour_max: " + co_eight_hour_max.getSouth() + "\n" +
                "no2_one_hour_max: " + no2_one_hour_max.getSouth() + "\n" +
                "so2_twenty_four_hourly: " + so2_twenty_four_hourly.getSouth() + "\n" +
                "pm25_sub_index: " + pm25_sub_index.getSouth() + "\n" +
                "psi_twenty_four_hourly: " + psi_twenty_four_hourly.getSouth() + "\n" +
                "o3_eight_hour_max: " + psi_twenty_four_hourly.getSouth() + "\n";

        return value;
    }

    public String getNorthValue() {
        String value = "o3_sub_index: " + o3_sub_index.getNorth() + "\n" +
                "pm10_twenty_four_hourly: " + pm10_twenty_four_hourly.getNorth() + "\n" +
                "pm10_sub_index: " + pm10_sub_index.getNorth() + "\n" +
                "co_sub_index: " + co_sub_index.getNorth() + "\n" +
                "pm25_twenty_four_hourly: " + pm25_twenty_four_hourly.getNorth() + "\n" +
                "so2_sub_index: " + so2_sub_index.getNorth() + "\n" +
                "co_eight_hour_max: " + co_eight_hour_max.getNorth() + "\n" +
                "no2_one_hour_max: " + no2_one_hour_max.getNorth() + "\n" +
                "so2_twenty_four_hourly: " + so2_twenty_four_hourly.getNorth() + "\n" +
                "pm25_sub_index: " + pm25_sub_index.getNorth() + "\n" +
                "psi_twenty_four_hourly: " + psi_twenty_four_hourly.getNorth() + "\n" +
                "o3_eight_hour_max: " + psi_twenty_four_hourly.getNorth() + "\n";

        return value;
    }
}

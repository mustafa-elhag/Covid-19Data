package com.cst2335.covid_19data;


public class Data {
    private String cityCode;
    private String status;
    private String country;
    private String lon;
    private String city;
    private String countryCode;
    private String province;
    private String lat;
    private int cases;
    private String date;

    public Data() {
    }


    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getLon() {
        return lon;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLat() {
        return lat;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getCases() {
        return cases;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return
                "Data{" +
                        "cityCode = '" + cityCode + '\'' +
                        ",status = '" + status + '\'' +
                        ",country = '" + country + '\'' +
                        ",lon = '" + lon + '\'' +
                        ",city = '" + city + '\'' +
                        ",countryCode = '" + countryCode + '\'' +
                        ",province = '" + province + '\'' +
                        ",lat = '" + lat + '\'' +
                        ",cases = '" + cases + '\'' +
                        ",date = '" + date + '\'' +
                        "}";
    }

}
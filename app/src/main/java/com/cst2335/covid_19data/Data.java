package com.cst2335.covid_19data;

import android.os.Parcel;
import android.os.Parcelable;


public class Data implements Parcelable {
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


    protected Data(Parcel in) {
        cityCode = in.readString();
        status = in.readString();
        country = in.readString();
        lon = in.readString();
        city = in.readString();
        countryCode = in.readString();
        province = in.readString();
        lat = in.readString();
        cases = in.readInt();
        date = in.readString();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(cityCode);
        parcel.writeString(status);
        parcel.writeString(country);
        parcel.writeString(lon);
        parcel.writeString(city);
        parcel.writeString(countryCode);
        parcel.writeString(province);
        parcel.writeString(lat);
        parcel.writeInt(cases);
        parcel.writeString(date);
    }
}

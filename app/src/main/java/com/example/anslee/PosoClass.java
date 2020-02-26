package com.example.anslee;

public class PosoClass {

    private String name,latitude,longititude;

    public PosoClass() {
    }

    public PosoClass(String name, String latitude, String longititude) {
        this.name = name;
        this.latitude = latitude;
        this.longititude = longititude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongititude() {
        return longititude;
    }

    public void setLongititude(String longititude) {
        this.longititude = longititude;
    }
}

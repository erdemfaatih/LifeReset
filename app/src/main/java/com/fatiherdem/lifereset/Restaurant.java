package com.fatiherdem.lifereset;


public class Restaurant {
    public String name;
    public String distance;
    public String density;

    public Restaurant() {}

    public Restaurant(String name, String distance, String density) {
        this.name = name;
        this.distance = distance;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }
}
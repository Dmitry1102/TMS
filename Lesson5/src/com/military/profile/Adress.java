package com.military.profile;

public class Adress {
    public String country[];
    public String city[];

    public Adress(String[] country, String[] city) {
        this.country = country;
        this.city = city;
    }

    public String[] getCountry() {
        return country;
    }

    public void setCountry(String[] country) {
        this.country = country;
    }

    public String[] getCity() {
        return city;
    }

    public void setCity(String[] city) {
        this.city = city;
    }
}

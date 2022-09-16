package com.lucas.solvd.database.models;

public class Players {
    private int id = 0;
    private String name = null;
    private String lastname = null;
    private String country = null;
    private int countries_id = 0;

    public Players(String name, String lastname, String country) {
        this.name = name;
        this.lastname = lastname;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCountries_id(int countries_id) {
        this.countries_id = countries_id;
    }

    public int getCountries_id() {
        return countries_id;
    }
}

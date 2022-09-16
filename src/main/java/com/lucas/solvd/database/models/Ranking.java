package com.lucas.solvd.database.models;

public class Ranking {
    private int id = 0;
    private int countries_id = 0;
    private int amount_of_points = 0;

    public Ranking(int amount_of_points) {
        this.amount_of_points = amount_of_points;
    }

    public void setAmount_of_points(int amount_of_points) {
        this.amount_of_points = amount_of_points;
    }

    public int getAmount_of_points() {
        return amount_of_points;
    }

    public void setCountries_id(int countries_id) {
        this.countries_id = countries_id;
    }

    public int getCountries_id() {
        return countries_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

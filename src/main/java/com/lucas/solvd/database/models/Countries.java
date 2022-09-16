package com.lucas.solvd.database.models;

public class Countries {
    private int id = 0;
    private String name = null;

    public Countries(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

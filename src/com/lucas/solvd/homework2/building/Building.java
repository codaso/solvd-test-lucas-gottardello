package com.lucas.solvd.homework2.building;

public abstract class Building {
    private int buildingID;
    private String buildingName = "";

    public Building(String hospitalName) {
        this.buildingName = hospitalName;
        this.buildingID = (int) Math.random() * 100;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public int getBuildingID() {
        return buildingID;
    }
}

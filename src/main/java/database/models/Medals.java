package database.models;

public class Medals {
    private int id = 0;
    private int countries_id = 0;
    private int gold = 0;
    private int silver = 0;
    private int bronze = 0;

    public Medals(int gold, int silver, int bronze) {
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    public int getCountries_id() {
        return countries_id;
    }

    public void setCountries_id(int countries_id) {
        this.countries_id = countries_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}

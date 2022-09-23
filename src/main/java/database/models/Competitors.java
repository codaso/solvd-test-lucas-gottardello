package database.models;

public class Competitors {
    private int id = 0;
    private int countries_id = 0;
    private int countries_id1 = 0;

    public Competitors() {
    }

    public void setCountries_id(int countries_id) {
        this.countries_id = countries_id;
    }

    public int getCountries_id() {
        return countries_id;
    }

    public void setCountries_id1(int countries_id1) {
        this.countries_id1 = countries_id1;
    }

    public int getCountries_id1() {
        return countries_id1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

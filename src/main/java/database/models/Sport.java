package database.models;

public class Sport {
    private int id = 0;
    private String name = null;
    private String season = null;

    public Sport(String name, String season) {
        this.name = name;
        this.season = season;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

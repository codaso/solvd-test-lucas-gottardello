package database.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Game {
    @JsonProperty
    private int id = 0;
    @JsonProperty
    private int competitors_id = 0;
    @JsonProperty
    private String sport = null;
    @JsonProperty
    private int sports_id = 0;
    @JsonProperty
    private int winner = 0;

    public Game(String sport, int winner) {
        this.sport = sport;
        this.winner = winner;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setCompetitors_id(int competitors_id) {
        this.competitors_id = competitors_id;
    }

    public int getCompetitors_id() {
        return competitors_id;
    }

    public void setSports_id(int sports_id) {
        this.sports_id = sports_id;
    }

    public int getSports_id() {
        return sports_id;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public int getWinner() {
        return winner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

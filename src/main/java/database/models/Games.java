package database.models;

public class Games {
    private int id = 0;
    private int game_id = 0;

    public Games() {
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public int getGame_id() {
        return game_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

package database.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Players {
    private int id;
    private Player player;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

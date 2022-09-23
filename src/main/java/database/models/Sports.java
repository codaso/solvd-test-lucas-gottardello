package database.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Sports {
    private int id;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

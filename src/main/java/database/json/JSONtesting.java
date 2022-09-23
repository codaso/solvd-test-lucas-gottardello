package database.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import database.models.Game;

public class JSONtesting {


    public static void main(String[] args) {
        //String gameJson = "{\"id\":1},\"competitors_id\":3,\"sport\":basketball,\"sports_id\":5,\"winner\":10}";
        String gameJson = "{\"id\": \"1\", \"competitors_id\": \"1\", \"sport\": \"basketball\", \"sports_id\": \"5\", \"winner\": \"1\"}";

        ObjectMapper om = new ObjectMapper();
        try {
            Game myGame = om.readValue(gameJson, Game.class);
            System.out.println(myGame.getSport());
            System.out.println(myGame.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

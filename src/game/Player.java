package game;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public String name;
    public ArrayList<Card> hand;
    boolean skipped = false;

    public Player(String name){
        this.name = name;
        hand = new ArrayList<>();
    }

}


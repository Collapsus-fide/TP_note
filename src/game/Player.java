package game;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Random;

public class Player {
    public String name;
    public ArrayList<Card> hand;
    boolean skipped = false;

    public Player(String name){
        this.name = name;
        hand = new ArrayList<>();
    }

    public Card play(){
        if(this.hand.size()==0){
            throw new EmptyStackException();
        }
        Random r = new Random();
        int low = 0;
        int high = this.hand.size();
        return this.hand.get(r.nextInt(high-low) + low);
    }

}


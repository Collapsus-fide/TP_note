package game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Random;

public class Player {
    public String name;
    public ArrayList<Card> hand;
    boolean skipped = false;
    public int wins = 0;

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
        Card played = this.hand.get(r.nextInt(high-low) + low);
        this.hand.remove(r.nextInt(high-low) + low);
        return played;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name+
                " ,wins ="+ wins+"}\n";
    }
    static class PlayerPointsComparator implements Comparator<Player> {
        public int compare(Player p1, Player p2) {
            if(p2.wins>p2.wins){
                return 1;
            }else if(p1.wins<p2.wins){
                return -1;
            }else{return 0;}
        }
    }
}


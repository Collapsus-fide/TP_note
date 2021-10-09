package game;

import java.util.*;

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
                "name= " + name+
                " ,wins ="+ wins+"}\n";
    }

    public Card playSameSuitIfPossible(String suit) {
        List<Card> playable =new ArrayList<>();
        Random r = new Random();
        int low = 0;
        for (Card c: hand
             ) {

            if(c.suit.equals(suit)){
                playable.add(c);
            }
        }
        if(playable.isEmpty()){
            int high = hand.size();
            return hand.get(r.nextInt(high-low) + low);
        }else{


            int high = playable.size();
            return playable.get(r.nextInt(high-low) + low);
        }

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


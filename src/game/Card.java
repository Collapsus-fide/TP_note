package game;

import java.util.Collections;
import java.util.Comparator;

public class Card implements Comparable {
    public String val;
    public String suit;
    public int points;

    public Card(String val, String suit, int points) {
        this.val = val;
        this.suit = suit;
        this.points = points;
    }
    //public void display(){ System.out.println("valeur : "+ this.val +"\n symbole : "+ this.suit); }

    @Override
    public String toString() {
        return "value=" + val +
                " suit=" + suit + '\n';
    }

    @Override
    public int compareTo(Object C) {
        CardComparator compar = new CardComparator();
        return compar.compare(this, (Card) C);

    }
    static class CardComparator implements Comparator<Card> {
        public int compare(Card c1, Card c2) {
            if (c1.suit.compareTo(c2.suit)==0){
                if (c1.points > c2.points) {
                    return 1;
                }
                if (c1.points < c2.points) {
                    return -1;
                }
            }else if (c1.suit.compareTo(c2.suit)>0){
                return 1;
            }else{
                return -1;
            }

            return 0;
        }
    }

    static class SuitComparator implements Comparator<Card> {
        public int compare(Card c1, Card c2) {
            return c1.suit.compareTo(c2.suit);
        }
    }


}

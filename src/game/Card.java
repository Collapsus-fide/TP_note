package game;

public class Card extends Comparable{
    public String val;
    public String suit;
    public int points;

    public Card(String val, String suit, int points){
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
    public int compareTo(Card C) {
        return
    }
}

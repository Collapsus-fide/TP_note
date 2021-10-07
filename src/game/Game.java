package game;

import structures.File;

import java.util.*;

public class Game {
    public File playerOrder;
    public HashMap<String, Integer > hash = new HashMap<String, Integer>();
    Player CurrentPlayer;

    public Game(){
        playerOrder = new File();
        hash.put("3",0 );
        hash.put("4",1 );
        hash.put("5",2 );
        hash.put("6",3 );
        hash.put("7",4 );
        hash.put("8",5 );
        hash.put("9",6 );
        hash.put("10",7 );
        hash.put("J",8 );
        hash.put("Q",9 );
        hash.put("R",10 );
        hash.put("A",11 );
        hash.put("2",12 );
    }
    public void addPlayers(){
        Scanner scanner = new Scanner(System.in);
        for(int i =1; i <=4;i++){
            System.out.println("Entrez le nom du joueur "+ i);
            String player = scanner.nextLine();
            playerOrder.addPlayer(player);


        }

    }
    public void start(){
        this.addPlayers();
        Card[] cards = {
                new Card("3", "club", 1),
                new Card("4", "club", 2),
                new Card("5", "club", 3),
                new Card("6", "club", 4),
                new Card("7", "club", 5),
                new Card("8", "club", 6),
                new Card("9", "club", 7),
                new Card("10", "club", 8),
                new Card("J", "club", 9),
                new Card("Q", "club", 10),
                new Card("R", "club", 11),
                new Card("A", "club", 12),
                new Card("2", "club", 0),

                new Card("3", "heart", 1),
                new Card("4", "heart", 2),
                new Card("5", "heart", 3),
                new Card("6", "heart", 4),
                new Card("7", "heart", 5),
                new Card("8", "heart", 6),
                new Card("9", "heart", 7),
                new Card("10", "heart", 8),
                new Card("J", "heart", 9),
                new Card("Q", "heart", 10),
                new Card("R", "heart", 11),
                new Card("A", "heart", 12),
                new Card("2", "heart", 0),

                new Card("3", "spade", 1),
                new Card("4", "spade", 2),
                new Card("5", "spade", 3),
                new Card("6", "spade", 4),
                new Card("7", "spade", 5),
                new Card("8", "spade", 6),
                new Card("9", "spade", 7),
                new Card("10", "spade", 8),
                new Card("J", "spade", 9),
                new Card("Q", "spade", 10),
                new Card("R", "spade", 11),
                new Card("A", "spade", 12),
                new Card("2", "spade", 0),


                new Card("3", "diamond", 1),
                new Card("4", "diamond", 2),
                new Card("5", "diamond", 3),
                new Card("6", "diamond", 4),
                new Card("7", "diamond", 5),
                new Card("8", "diamond", 6),
                new Card("9", "diamond", 7),
                new Card("10", "diamond", 8),
                new Card("J", "diamond", 9),
                new Card("Q", "diamond", 10),
                new Card("R", "diamond", 11),
                new Card("A", "diamond", 12),
                new Card("2", "diamond", 0)
        };

        for (int i = 0; i < 300;i++){
            Random r = new Random();
            int low = 0;
            int high = 51;
            int card1 = r.nextInt(high-low) + low;
            int card2 = r.nextInt(high-low) + low;
            Card temp =cards[card1];
            cards[card1]= cards[card2];
            cards[card2] = temp;

        }
        for(Card card : cards){
            playerOrder.advance().hand.add(card);
        }
        for(int i =0 ; i<4;i++){
            Collections.sort(playerOrder.advance().hand);
        }



    }

}

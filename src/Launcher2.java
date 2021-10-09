import game.Game;

import java.util.Random;

public class Launcher2 {
    public static void main(String[] args) {
        Game jeu = new Game();
        jeu.start();
        Random random = new Random();
        for(int i = 0;i<random.nextInt(100);i++){
            jeu.playerOrder.advance();
        }
        while(!jeu.playerOrder.origin.player.hand.isEmpty()){
            jeu.playTurnSameSuit();
        }
        System.out.println(jeu.end());
    }
}

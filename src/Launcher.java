import game.Game;

public class Launcher {
    public static void main(String[] args) {
        Game jeu = new Game();
        jeu.start();
        while(!jeu.playerOrder.origin.player.hand.isEmpty()){
            jeu.playTurn();
        }
        System.out.println(jeu.end());
    }
}

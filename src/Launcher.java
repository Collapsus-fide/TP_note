import game.Game;

public class Launcher {
    public static void main(String[] args) {
        Game jeu = new Game();
        jeu.start();
        System.out.println(jeu.playerOrder.origin.player.hand);
    }
}

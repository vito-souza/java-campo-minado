import game.factory.GameFactory;
import game.logic.GameHandler;

public class App {
    public static void main(String[] args) {
        GameHandler newGame = GameFactory.generateNewGame();
        newGame.start();
    }
}

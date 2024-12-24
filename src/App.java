import game.factory.GameFactory;
import game.logic.GameHandler;
import game.ui.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        GameHandler newGame = GameFactory.generateNewGame();
        newGame.start();
    }
}

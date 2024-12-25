package game.factory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import game.audio.Soundtrack;
import game.logic.GameHandler;
import game.model.Difficulty;
import game.ui.Menu;

public class GameFactory {
    private GameFactory() {
    }

    public static GameHandler generateNewGame() {
        Menu.title();
        Soundtrack.play("/music/menu.wav", true);

        Pattern pattern = Pattern.compile("^/play (easy|medium|hard)$");

        while (true) {
            String input = Menu.inputPrompt().trim();

            if (input.equalsIgnoreCase("/exit")) {
                System.out.println("Saindo do jogo...\n");
                System.exit(0);
            }

            Matcher matcher = pattern.matcher(input);

            if (matcher.matches()) {
                return new GameHandler(Difficulty.valueOf(matcher.group(1).toUpperCase()));
            }

            System.out.println("Entrada inválida! Use: /play [easy|medium|hard] ou /exit para sair.");
        }
    }
}

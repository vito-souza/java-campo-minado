package game.factory;

import game.audio.Soundtrack;
import game.logic.GameHandler;
import game.ui.Menu;
import model.Difficulty;

public class GameFactory {
    private GameFactory() {
    }

    public static GameHandler generateNewGame() {
        Menu.title();
        Soundtrack.play("/music/menu.wav");

        while (true) {
            String input = Menu.inputPrompt();

            if (input.startsWith("/play")) {
                GameHandler newGame = generateGame(input);

                if (newGame == null) {
                    continue;
                }

                Menu.rules();
                Menu.commands();
                return newGame;
            }

            if (input.equalsIgnoreCase("/exit")) {
                System.out.println("Saindo do jogo...\n");
                System.exit(0);
            }
        }
    }

    private static GameHandler generateGame(String input) {
        String[] parts = input.split(" ");

        if (parts.length != 2 || getDifficulty(parts[1]) == null) {
            System.out.println("Comando inválido. Use: /play [easy|medium|hard]\n");
            return null;
        }

        System.out.println("Iniciando o jogo...\n");

        return new GameHandler(getDifficulty(parts[1]));
    }

    private static Difficulty getDifficulty(String input) {
        switch (input.toLowerCase()) {
            case "easy":
                return Difficulty.EASY;
            case "medium":
                return Difficulty.MEDIUM;
            case "hard":
                return Difficulty.HARD;
            default:
                return null;
        }
    }
}

package game.factory;

import java.util.Scanner;

import game.logic.GameHandler;
import game.ui.Menu;
import model.Difficulty;

public class GameFactory {
    private static final Scanner SCANNER = new Scanner(System.in);

    private GameFactory() {
    }

    public static GameHandler generateNewGame() {
        Menu.title();
        boolean loop = true;

        do {
            System.out.print("> ");
            String input = SCANNER.nextLine().trim();
            System.out.println();

            if (input.startsWith("/play")) {
                return generateGame(input);
            }

            if (input.equalsIgnoreCase("/exit")) {
                System.out.println("Saindo do jogo...\n");
                loop = false;
            } else {
                System.out.println("Comando inválido. Tente novamente.\n");
            }
        } while (loop);

        return null;
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

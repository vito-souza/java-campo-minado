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

        while (true) {
            String input = inputPrompt();

            if (input.startsWith("/play")) {
                GameHandler newGame = generateGame(input);

                if (newGame == null) {
                    continue;
                }

                displayRules();
                displayCommands();
                return newGame;
            }

            if (input.equalsIgnoreCase("/exit")) {
                System.out.println("Saindo do jogo...\n");
                System.exit(0);
            }
        }
    }

    private static String inputPrompt() {
        System.out.print("> ");
        String input = SCANNER.nextLine().trim();
        System.out.println();

        return input;
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

    private static void displayRules() {
        Menu.rules();
        inputPrompt();
    }

    public static void displayCommands() {
        Menu.commands();
        inputPrompt();
    }
}

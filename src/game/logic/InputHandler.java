package game.logic;

import java.util.Scanner;

import model.Difficulty;

@SuppressWarnings("java:S106")
public class InputHandler {
    private static final Scanner SCANNER = new Scanner(System.in);

    private InputHandler() {
    }

    public static void menu() {
        boolean valid = false;

        do {
            System.out.print("> ");
            String input = SCANNER.nextLine().trim();
            System.out.println();

            if (input.startsWith("/play")) {
                GameHandler newGame = generateGame(input);

                if (newGame != null) {
                    newGame.run();
                    valid = true;
                }
            } else if (input.equalsIgnoreCase("/exit")) {
                System.out.println("Saindo do jogo...\n");
                valid = true;
            } else {
                System.out.println("Comando inválido. Tente novamente.\n");
                valid = false;
            }

        } while (!valid);
    }

    private static GameHandler generateGame(String input) {
        String[] parts = input.split(" ");

        if (parts.length == 2) {
            Difficulty difficulty = getDifficulty(parts[1]);

            if (difficulty != null) {
                System.out.println("Iniciando o jogo...\n");
                return new GameHandler(difficulty);
            } else {
                System.out.println("Dificuldade inválida. Tente novamente.\n");
            }
        }

        return null;
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

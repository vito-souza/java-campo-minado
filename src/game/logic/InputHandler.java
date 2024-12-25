package game.logic;

import java.util.Scanner;

public class InputHandler {
    private static final Scanner SCANNER = new Scanner(System.in);
    private final GameHandler game;

    public InputHandler(GameHandler game) {
        this.game = game;
    }

    public void getInput() {
        boolean loop = true;

        do {
            System.out.print("\n> ");
            String input = SCANNER.nextLine().trim();
            System.out.println();

            String[] parts = input.split(" ", 2);

            if (parts.length < 2) {
                System.out.println("Entrada inválida. Tente novamente.");
                continue;
            }

            int row = Integer.parseInt(parts[1].replaceAll("[^0-9]", ""));

            char letter = parts[1].replaceAll("[^a-zA-Z]", "").charAt(0);
            int col = letter - 'a';

            if (input.startsWith("/reveal")) {
                game.reveal(row, col);
                return;
            }

            if (input.startsWith("/flag")) {
                game.setFlag(row, col);
                return;
            }

            System.out.println("Insira uma entrada válida.");
        } while (loop);
    }
}

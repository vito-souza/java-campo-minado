package game.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import game.ui.Menu;

public class InputHandler {
    private final GameHandler game;

    public InputHandler(GameHandler game) {
        this.game = game;
    }

    public void a() {
        boolean loop = true;

        do {
            String input = Menu.inputPrompt();

            String[] parts = input.split(" ", 2);

            int row = Integer.parseInt(parts[1].replaceAll("[^0-9]", ""));

            char letter = parts[1].replaceAll("[^a-zA-Z]", "").charAt(0);
            int col = letter - 'a';

            if (row > game.getRows() || row < 0 || col > game.getColumns() || col < 0) {
                System.out.println("Coordenadas inválidas. Tente novamente.");
                continue;
            }

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

    public void getInput() {
        String input = Menu.inputPrompt();

        Pattern pattern = Pattern.compile("^/reveal (\\d+)([a-zA-Z])$");
        Matcher matcher = pattern.matcher(input);

        while (!matcher.matches()) {
            System.out.println("Entrada inválida! Tente novamente.");
            input = Menu.inputPrompt();
            matcher = pattern.matcher(input);
        }

        int row = Integer.parseInt(matcher.group(1));
        char colCharacter = matcher.group(2).charAt(0);

        int col = colCharacter - 'a';

        if (input.startsWith("/reveal")) {
            game.reveal(row, col);
        } else if (input.startsWith("/flag")) {
            game.setFlag(row, col);
        }
    }
}

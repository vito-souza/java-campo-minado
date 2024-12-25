package game.logic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import game.ui.Menu;

public class InputHandler {
    private final GameHandler game;

    public InputHandler(GameHandler game) {
        this.game = game;
    }

    public void getInput() {
        String input = Menu.inputPrompt();

        Pattern pattern = Pattern.compile("^/(reveal|flag) (\\d+)([a-zA-Z])$");
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

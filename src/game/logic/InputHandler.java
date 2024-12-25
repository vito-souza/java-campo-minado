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

        String command = matcher.group(1);
        int row = Integer.parseInt(matcher.group(2));
        char colCharacter = matcher.group(3).charAt(0);

        int col = colCharacter - 'a';

        if (command.equals("reveal")) {
            game.reveal(row, col);
        } else if (command.equals("flag")) {
            game.setFlag(row, col);
        }
    }
}

package game.logic;

import java.util.Scanner;

public class InputHandler {
    private static final Scanner SCANNER = new Scanner(System.in);

    public void getInput() {
        boolean loop = true;

        do {
            System.out.print("> ");
            String input = SCANNER.nextLine().trim();
            System.out.println();

            if (input.startsWith("/reveal")) {
            }

            if (input.startsWith("/flag")) {
            }

            if (input.startsWith("/unflag")) {
            }
        } while (loop);
    }
}

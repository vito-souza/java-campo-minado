package game.ui;

public class TerminalUtils {

    private TerminalUtils() {
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

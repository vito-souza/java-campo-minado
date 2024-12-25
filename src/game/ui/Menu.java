package game.ui;

import java.util.Scanner;

public class Menu {
    private static final Scanner SCANNER = new Scanner(System.in);

    private static final String GAME_TITLE = """
             ██████╗ █████╗ ███╗   ███╗██████╗  ██████╗     ███╗   ███╗██╗███╗   ██╗ █████╗ ██████╗  ██████╗
            ██╔════╝██╔══██╗████╗ ████║██╔══██╗██╔═══██╗    ████╗ ████║██║████╗  ██║██╔══██╗██╔══██╗██╔═══██╗
            ██║     ███████║██╔████╔██║██████╔╝██║   ██║    ██╔████╔██║██║██╔██╗ ██║███████║██║  ██║██║   ██║
            ██║     ██╔══██║██║╚██╔╝██║██╔═══╝ ██║   ██║    ██║╚██╔╝██║██║██║╚██╗██║██╔══██║██║  ██║██║   ██║
            ╚██████╗██║  ██║██║ ╚═╝ ██║██║     ╚██████╔╝    ██║ ╚═╝ ██║██║██║ ╚████║██║  ██║██████╔╝╚██████╔╝
             ╚═════╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝      ╚═════╝     ╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═════╝  ╚═════╝
            """;

    public static final String GAME_RULES = """
            ██████╗ ███████╗ ██████╗ ██████╗  █████╗ ███████╗
            ██╔══██╗██╔════╝██╔════╝ ██╔══██╗██╔══██╗██╔════╝██╗
            ██████╔╝█████╗  ██║  ███╗██████╔╝███████║███████╗╚═╝
            ██╔══██╗██╔══╝  ██║   ██║██╔══██╗██╔══██║╚════██║██╗
            ██║  ██║███████╗╚██████╔╝██║  ██║██║  ██║███████║╚═╝
            ╚═╝  ╚═╝╚══════╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝
            """;

    public static final String GAME_COMANDS = """
             ██████╗ ██████╗ ███╗   ███╗ █████╗ ███╗   ██╗██████╗  ██████╗ ███████╗
            ██╔════╝██╔═══██╗████╗ ████║██╔══██╗████╗  ██║██╔══██╗██╔═══██╗██╔════╝██╗
            ██║     ██║   ██║██╔████╔██║███████║██╔██╗ ██║██║  ██║██║   ██║███████╗╚═╝
            ██║     ██║   ██║██║╚██╔╝██║██╔══██║██║╚██╗██║██║  ██║██║   ██║╚════██║██╗
            ╚██████╗╚██████╔╝██║ ╚═╝ ██║██║  ██║██║ ╚████║██████╔╝╚██████╔╝███████║╚═╝
             ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝  ╚═════╝ ╚══════╝
            """;

    public static final String GAME_OVER = """
             ██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ██╗   ██╗███████╗██████╗
            ██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔══██╗
            ██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║██║   ██║█████╗  ██████╔╝
            ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗
            ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║
             ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝
            """;

    public static final String YOU_WIN = """
            ██╗   ██╗ ██████╗ ██╗   ██╗    ██╗    ██╗██╗███╗   ██╗██╗
            ╚██╗ ██╔╝██╔═══██╗██║   ██║    ██║    ██║██║████╗  ██║██║
             ╚████╔╝ ██║   ██║██║   ██║    ██║ █╗ ██║██║██╔██╗ ██║██║
              ╚██╔╝  ██║   ██║██║   ██║    ██║███╗██║██║██║╚██╗██║╚═╝
               ██║   ╚██████╔╝╚██████╔╝    ╚███╔███╔╝██║██║ ╚████║██╗
               ╚═╝    ╚═════╝  ╚═════╝      ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝╚═╝
            """;

    private Menu() {
    }

    public static void title() {
        TerminalUtils.clear();

        System.out.println("\n" + GAME_TITLE);
        System.out.println("\tDigite \"/play [dificuldade]\" para jogar e \"/exit\" para sair.\n");
        System.out.println("\t\tExemplo: /play medium\n");
    }

    public static void rules() {
        TerminalUtils.clear();

        System.out.println("\n" + GAME_RULES);
        System.out.println("\t1. O objetivo é descobrir todas as células do tabuleiro sem selecionar uma mina.");
        System.out.println("\t2. Cada célula pode conter uma mina ou um número indicando minas ao redor.");
        System.out.println("\t3. Selecionar uma célula com uma mina termina o jogo.");
        System.out.println("\t4. O jogo termina quando todas as células sem minas forem abertas.\n");
        inputPrompt();
    }

    public static void commands() {
        TerminalUtils.clear();

        System.out.println("\n" + GAME_COMANDS);
        System.out.println("\t1. Use \"/reveal [posição]\" para revelar uma célula no tabuleiro.");
        System.out.println(
                "\t2. Use \"/flag [posição]\" para marcar/desmarcar uma célula como suspeita de conter uma mina.");
        System.out.println("\t\tExemplo: /reveal 1b, /flag 3c...\n");
        inputPrompt();
    }

    public static void gameOver() {
        TerminalUtils.clear();

        System.out.println("\n" + GAME_OVER);
        System.out.println("\tVocê selecionou uma bomba.\n");
        inputPrompt();
    }

    public static void victory() {
        TerminalUtils.clear();

        System.out.println("\n" + YOU_WIN);
        System.out.println("\tParabéns! Você teve paciência o suficiente pra chegar ao fim do jogo sem perder.\n");
        inputPrompt();
    }

    public static String inputPrompt() {
        System.out.print("> ");
        String input = SCANNER.nextLine().trim();
        System.out.println();

        return input;
    }
}

package game.ui;

import java.util.Scanner;

import game.audio.Soundtrack;

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

    public static final String CREDITS = """
             ██████╗██████╗ ███████╗██████╗ ██╗████████╗ ██████╗ ███████╗
            ██╔════╝██╔══██╗██╔════╝██╔══██╗██║╚══██╔══╝██╔═══██╗██╔════╝
            ██║     ██████╔╝█████╗  ██║  ██║██║   ██║   ██║   ██║███████╗
            ██║     ██╔══██╗██╔══╝  ██║  ██║██║   ██║   ██║   ██║╚════██║
            ╚██████╗██║  ██║███████╗██████╔╝██║   ██║   ╚██████╔╝███████║
             ╚═════╝╚═╝  ╚═╝╚══════╝╚═════╝ ╚═╝   ╚═╝    ╚═════╝ ╚══════╝
            """;

    private Menu() {
    }

    public static void title() {
        TerminalUtils.clear();

        System.out.println("\n" + GAME_TITLE);
        System.out.println("\tDigite \"/play [dificuldade]\" para jogar e \"/exit\" para sair.\n");
        System.out.println("\t\tExemplo: /play medium");
    }

    public static void rules() {
        TerminalUtils.clear();

        System.out.println("\n" + GAME_RULES);
        System.out.println("\t1. O objetivo é descobrir todas as células do tabuleiro sem selecionar uma mina.");
        System.out.println("\t2. Cada célula pode conter uma mina ou um número indicando minas ao redor.");
        System.out.println("\t3. Selecionar uma célula com uma mina termina o jogo.");
        System.out.println("\t4. O jogo termina quando todas as células sem minas forem abertas.");
        inputPrompt();
    }

    public static void commands() {
        TerminalUtils.clear();

        System.out.println("\n" + GAME_COMANDS);
        System.out.println("\t1. Use \"/reveal [posição]\" para revelar uma célula no tabuleiro.");
        System.out.println(
                "\t2. Use \"/flag [posição]\" para marcar/desmarcar uma célula como suspeita de conter uma mina.");
        System.out.println("\t\tExemplo: /reveal 1b, /flag 3c...");
        inputPrompt();
    }

    public static void gameOver() {
        TerminalUtils.clear();
        Soundtrack.play("/music/game_over.wav", true);

        System.out.println("\n" + GAME_OVER);
        System.out.println("\tVocê selecionou uma bomba.");
        inputPrompt();

        displayCredits();
    }

    public static void victory() {
        TerminalUtils.clear();
        Soundtrack.play("/music/you_win.wav", true);

        System.out.println("\n" + YOU_WIN);
        System.out.println("\tParabéns! Você teve paciência o suficiente pra chegar ao fim do jogo sem perder.");
        inputPrompt();

        displayCredits();
    }

    public static void displayCredits() {
        TerminalUtils.clear();
        System.out.println("\n" + CREDITS);

        System.out.println("🎮 **Créditos do Jogo** 🎮\n");
        System.out.println("**Desenvolvimento**: Eu");
        System.out.println("**Roteiro**: Eu");
        System.out.println("**Programação**: Eu");
        System.out.println("**Design**: Eu");
        System.out.println("**Áudio**: Eu");
        System.out.println("**Testes**: Eu");
        System.out.println("**Apoio Moral**: Eu");
        System.out.println("**Planejamento**: Nenhum");
        System.out.println("**Controle de Qualidade**: Nenhum\n");
        System.out.println("**Obrigado por jogar!** Se sobreviveu, parabéns! 🙏🎮\n");

        inputPrompt();
    }

    public static String inputPrompt() {
        System.out.print("\n> ");
        String input = SCANNER.nextLine().trim();
        System.out.println();

        return input;
    }
}

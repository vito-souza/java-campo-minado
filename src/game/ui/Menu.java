package game.ui;

import game.factory.GameFactory;

@SuppressWarnings("java:S106")
public class Menu {
    private static final String TITLE = """
             ██████╗ █████╗ ███╗   ███╗██████╗  ██████╗     ███╗   ███╗██╗███╗   ██╗ █████╗ ██████╗  ██████╗
            ██╔════╝██╔══██╗████╗ ████║██╔══██╗██╔═══██╗    ████╗ ████║██║████╗  ██║██╔══██╗██╔══██╗██╔═══██╗
            ██║     ███████║██╔████╔██║██████╔╝██║   ██║    ██╔████╔██║██║██╔██╗ ██║███████║██║  ██║██║   ██║
            ██║     ██╔══██║██║╚██╔╝██║██╔═══╝ ██║   ██║    ██║╚██╔╝██║██║██║╚██╗██║██╔══██║██║  ██║██║   ██║
            ╚██████╗██║  ██║██║ ╚═╝ ██║██║     ╚██████╔╝    ██║ ╚═╝ ██║██║██║ ╚████║██║  ██║██████╔╝╚██████╔╝
             ╚═════╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝      ╚═════╝     ╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═════╝  ╚═════╝
            """;

    private Menu() {
    }

    public static void title() {
        clear();

        System.out.println("\n" + TITLE);
        System.out.println("\tDigite \"/play [dificuldade]\" para jogar e \"/exit\" para sair.\n");
        System.out.println("\t\tExemplo: /play medium\n");
    }

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

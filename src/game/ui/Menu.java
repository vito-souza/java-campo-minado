package game.ui;

import game.logic.InputHandler;

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
        System.out.println("\n" + TITLE);
        System.out.println("\tDigite \"/play [dificuldade]\" para jogar e \"/exit\" para sair.\n");
        System.out.println("\t\tExemplo: /play easy\n");
        InputHandler.menu();
    }
}

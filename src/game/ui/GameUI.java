package game.ui;

import game.logic.GameHandler;
import model.Node;

@SuppressWarnings("java:S106")
public class GameUI {
    private static final String BOMB_EMOJI = "💣";
    private static final String FLAG_EMOJI = "🚩";
    private static final String TREE_EMOJI = "🌳";

    private final int rows;
    private final int columns;
    private final Node[][] board;

    public GameUI(GameHandler game) {
        this.columns = game.getColumns();
        this.rows = game.getRows();
        this.board = game.getBoard();
    }

    private void renderColumnHeader() {
        System.out.print(" ".repeat(4));

        for (int col = 0; col < columns; col++) {
            System.out.print((char) ('A' + col) + " ");
        }

        System.out.println();
    }

    private void renderRow(int row) {
        System.out.printf("%2d ", row);

        for (int col = 0; col < columns; col++) {
            Node value = board[row][col];
            System.out.print(renderNode(value));
        }

        System.out.println();
    }

    private String renderNode(Node node) {
        if (node.isBomb())
            return BOMB_EMOJI;
        else if (node.isFlagged())
            return FLAG_EMOJI;
        else if (node.isRevealed())
            return String.valueOf(" " + node.getBombsAround());
        else
            return TREE_EMOJI;
    }

    public void renderGame() {
        renderColumnHeader();

        for (int row = 0; row < rows; row++) {
            renderRow(row);
        }
    }
}

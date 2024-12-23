package game.ui;

import game.logic.GameHandler;
import model.Node;

public class GameUI {
    private final int columns;
    private final int rows;
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
            System.out.print(renderNode(value, row, col));
        }

        System.out.println();
    }

    private String renderNode(Node node, int row, int col) {
        if (node.isBomb())
            return "💣";
        else if (node.isFlagged())
            return "🚩";
        else
            return (row + col) % 2 == 0 ? "🌳" : "🟩";
    }

    public void renderGame() {
        renderColumnHeader();

        for (int row = 0; row < rows; row++) {
            renderRow(row);
        }
    }
}

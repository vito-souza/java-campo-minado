package game.ui;

import game.Game;

public class GameUI {
    private final int columns;
    private final int rows;
    private final int[][] board;

    public GameUI(Game game) {
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
            int value = board[row][col];
            System.out.print(renderNode(value, row, col));
        }

        System.out.println();
    }

    private String renderNode(int value, int row, int col) {
        switch (value) {
            case 0:
                return (row + col) % 2 == 0 ? "🌳" : "🟩";
            case -1:
                return "💣";
            case -2:
                return "🚩";
            default:
                return String.valueOf(value);
        }
    }

    public void renderGame() {
        renderColumnHeader();

        for (int row = 0; row < rows; row++) {
            renderRow(row);
        }
    }
}

package game;

import java.util.Random;

import game.ui.GameUI;
import model.Difficulty;

public class Game {
    private final int rows;
    private final int columns;
    private final int bombs;
    private final int[][] board;
    private final Random random = new Random();

    public Game(Difficulty difficulty) {
        this.rows = difficulty.getRows();
        this.columns = difficulty.getColumns();
        this.bombs = difficulty.getBombs();
        this.board = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int[][] getBoard() {
        return board;
    }

    void placeBombs() {
        int placed = 0;

        while (placed < bombs) {
            int row = random.nextInt(rows);
            int col = random.nextInt(columns);

            if (board[row][col] != -1) {
                board[row][col] = -1;
                placed++;
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game(Difficulty.MEDIUM);
        game.placeBombs();

        GameUI ui = new GameUI(game);
        ui.renderGame();
    }
}

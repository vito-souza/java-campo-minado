package game.logic;

import java.util.Random;

import game.ui.GameUI;
import model.Difficulty;
import model.Node;

public class GameHandler {
    private final int rows;
    private final int columns;
    private final int bombs;

    private final Node[][] board;
    private final Random random = new Random();

    public GameHandler(Difficulty difficulty) {
        this.rows = difficulty.getRows();
        this.columns = difficulty.getColumns();
        this.bombs = difficulty.getBombs();
        this.board = new Node[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Node[][] getBoard() {
        return board;
    }

    public void initBoard() {
        for (int row = 0; row < rows; row++)
            for (int col = 0; col < columns; col++)
                board[row][col] = new Node();
    }

    public void placeBombs() {
        int placed = 0;

        while (placed < bombs) {
            int row = random.nextInt(rows);
            int col = random.nextInt(columns);

            if (!board[row][col].isBomb()) {
                board[row][col].setBomb(true);
                placed++;
            }
        }
    }

    public static void main(String[] args) {
        GameHandler game = new GameHandler(Difficulty.MEDIUM);
        game.initBoard();
        game.placeBombs();

        GameUI ui = new GameUI(game);
        ui.renderGame();
    }
}

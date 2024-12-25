package game.model;

public enum Difficulty {
    EASY(8, 10, 10),
    MEDIUM(14, 18, 40),
    HARD(20, 24, 99);

    private final int rows;
    private final int columns;
    private final int bombs;

    Difficulty(int rows, int columns, int bombs) {
        this.rows = rows;
        this.columns = columns;
        this.bombs = bombs;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int getBombs() {
        return bombs;
    }
}

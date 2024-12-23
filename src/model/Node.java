package model;

public class Node {
    private boolean isRevealed;
    private boolean isFlagged;
    private boolean isBomb;
    private int bombsAround;

    public Node() {
        this.isRevealed = false;
        this.isFlagged = false;
        this.isBomb = false;
        this.bombsAround = 0;
    }

    public boolean isRevealed() {
        return isRevealed;
    }

    public boolean isFlagged() {
        return isFlagged;
    }

    public boolean isBomb() {
        return isBomb;
    }

    public void setBomb(boolean isBomb) {
        this.isBomb = isBomb;
    }

    public int getBombsAround() {
        return bombsAround;
    }

    public void setBombsAround(int bombsAround) {
        this.bombsAround = bombsAround;
    }

    public void reveal() {
        if (!isFlagged) {
            this.isRevealed = true;
        }
    }

    public void toggleFlag() {
        if (!isRevealed) {
            this.isFlagged = !this.isFlagged;
        }
    }
}

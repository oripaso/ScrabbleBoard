
package test;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Word {
    Tile[] tiles;
    int col ,row;
    boolean vertical;


    public Word(Tile[] tiles, int row, int col, boolean vertical) {
        this.tiles = tiles;
        this.col = col;
        this.row = row;
        this.vertical = vertical;
    }

    public Tile[] getTiles() {
        return tiles;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public boolean isVertical() {
        return vertical;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return col == word.col && row == word.row && vertical == word.vertical && Arrays.equals(tiles, word.tiles);
    }



}

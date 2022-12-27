
package test;


import java.util.Objects;
import java.util.Random;

public class Tile {

    public final char letter;
    public final int score;

    private Tile(char letter, int score) {
        this.letter = letter;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return letter == tile.letter && score == tile.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(letter, score);
    }


    public static class Bag {

        final int[] atFirst = {9, 2, 2, 4, 12, 2, 3, 2, 9, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};
        int[] quantityLtr = {9, 2, 2, 4, 12, 2, 3, 2, 9, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};

        Tile[] tiles;

        private int capacity;


        private static Bag bag = null;

        private Bag() {
            tiles = new Tile[]{new Tile('A', 1), new Tile('B', 3),
                    new Tile('C', 3), new Tile('D', 2), new Tile('E', 1), new Tile('F', 4),
                    new Tile('G', 2), new Tile('H', 4), new Tile('I', 1), new Tile('J', 8),
                    new Tile('K', 5), new Tile('L', 1), new Tile('M', 3), new Tile('N', 1),
                    new Tile('O', 1), new Tile('P', 3), new Tile('Q', 10), new Tile('R', 1),
                    new Tile('S', 1), new Tile('T', 1), new Tile('U', 1), new Tile('V', 4),
                    new Tile('W', 4), new Tile('X', 8), new Tile('Y', 4), new Tile('Z', 10)};

            capacity = 98;
        }

        public Tile getRand() {
            Random rand = new Random();
            int letter = rand.nextInt(26);
            if (capacity == 0)
                return null;
            while (quantityLtr[letter] == 0) {
                letter = rand.nextInt(26);

            }
            quantityLtr[letter] -= 1;
            capacity--;

            return tiles[letter];

        }

        public Tile getTile(char letter) {
            int i;
            for (i = 0; i < 26; i++) {
                if (tiles[i].letter == letter && quantityLtr[i] != 0) // check if letter exist , we have more tiles of him
                {
                    capacity--;
                    quantityLtr[i]--;
                    return tiles[i];
                }
            }
            return null;
        }

        public void put(Tile t) {
            if (capacity == 98) {
                return;
            }
            for (int i = 0; i < 26; i++) {
                if (tiles[i].letter == t.letter && quantityLtr[i] + 1 <= atFirst[i]) {
                    quantityLtr[i]++;
                    capacity++;
                }
            }
        }


        public int size() {
            return capacity;
        }

        public int[] getQuantityLtr() {
            return quantityLtr.clone();
        }

        public int [] getQuantities()
        {
            int[] quantities = (int[])quantityLtr.clone();
            return quantities;
        }

        public static Bag getBag() {
            if (bag == null) {
                bag = new Bag();
            }
            return bag;
        }

    }

}

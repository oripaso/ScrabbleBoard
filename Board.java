// Id: 209493683
// Name : Ori Paso
package test;

import java.util.ArrayList;
import java.util.HashMap;

public class Board {

    // the map keys for calc the special bonus
    private static HashMap<String, String> mapBonus = new HashMap<>();

    // holder the board of the game
    private static Board board;
    Tile[][] Game_Board = new Tile[15][15]; // size of the board

    // singleton
    public static Board getBoard() {
        if (board == null) {
            board = new Board();
            initialMapBonus();
        }

        return board;
    }


    private static void initialMapBonus() {

        mapBonus.put("01", "green");
        mapBonus.put("02", "green");
        mapBonus.put("04", "green");
        mapBonus.put("05", "green");
        mapBonus.put("06", "green");
        mapBonus.put("08", "green");
        mapBonus.put("09", "green");
        mapBonus.put("010", "green");
        mapBonus.put("012", "green");
        mapBonus.put("013", "green");

        mapBonus.put("10", "green");
        mapBonus.put("12", "green");
        mapBonus.put("13", "green");
        mapBonus.put("14", "green");
        mapBonus.put("16", "green");
        mapBonus.put("17", "green");
        mapBonus.put("18", "green");
        mapBonus.put("110", "green");
        mapBonus.put("111", "green");
        mapBonus.put("112", "green");
        mapBonus.put("114", "green");
        mapBonus.put("20", "green");
        mapBonus.put("21", "green");
        mapBonus.put("24", "green");
        mapBonus.put("25", "green");
        mapBonus.put("27", "green");
        mapBonus.put("29", "green");
        mapBonus.put("210", "green");
        mapBonus.put("211", "green");
        mapBonus.put("213", "green");
        mapBonus.put("214", "green");
        mapBonus.put("31", "green");
        mapBonus.put("32", "green");
        mapBonus.put("34", "green");
        mapBonus.put("35", "green");
        mapBonus.put("36", "green");
        mapBonus.put("38", "green");
        mapBonus.put("39", "green");
        mapBonus.put("310", "green");
        mapBonus.put("312", "green");
        mapBonus.put("313", "green");
        mapBonus.put("40", "green");
        mapBonus.put("41", "green");
        mapBonus.put("42", "green");
        mapBonus.put("43", "green");
        mapBonus.put("45", "green");
        mapBonus.put("46", "green");
        mapBonus.put("47", "green");
        mapBonus.put("48", "green");
        mapBonus.put("49", "green");
        mapBonus.put("411", "green");
        mapBonus.put("412", "green");
        mapBonus.put("413", "green");
        mapBonus.put("414", "green");
        mapBonus.put("50", "green");
        mapBonus.put("52", "green");
        mapBonus.put("53", "green");
        mapBonus.put("54", "green");
        mapBonus.put("56", "green");
        mapBonus.put("57", "green");
        mapBonus.put("58", "green");
        mapBonus.put("510", "green");
        mapBonus.put("511", "green");
        mapBonus.put("512", "green");
        mapBonus.put("514", "green");
        mapBonus.put("60", "green");
        mapBonus.put("61", "green");
        mapBonus.put("63", "green");
        mapBonus.put("64", "green");
        mapBonus.put("65", "green");
        mapBonus.put("67", "green");
        mapBonus.put("69", "green");
        mapBonus.put("610", "green");
        mapBonus.put("611", "green");
        mapBonus.put("613", "green");
        mapBonus.put("614", "green");
        mapBonus.put("71", "green");
        mapBonus.put("72", "green");
        mapBonus.put("74", "green");
        mapBonus.put("75", "green");
        mapBonus.put("76", "green");
        mapBonus.put("78", "green");
        mapBonus.put("79", "green");
        mapBonus.put("710", "green");
        mapBonus.put("712", "green");
        mapBonus.put("713", "green");
        mapBonus.put("80", "green");
        mapBonus.put("81", "green");
        mapBonus.put("83", "green");
        mapBonus.put("84", "green");
        mapBonus.put("85", "green");
        mapBonus.put("87", "green");
        mapBonus.put("89", "green");
        mapBonus.put("810", "green");
        mapBonus.put("811", "green");
        mapBonus.put("813", "green");
        mapBonus.put("814", "green");
        mapBonus.put("90", "green");
        mapBonus.put("92", "green");
        mapBonus.put("93", "green");
        mapBonus.put("94", "green");
        mapBonus.put("96", "green");
        mapBonus.put("97", "green");
        mapBonus.put("98", "green");
        mapBonus.put("910", "green");
        mapBonus.put("911", "green");
        mapBonus.put("912", "green");
        mapBonus.put("914", "green");
        mapBonus.put("100", "green");
        mapBonus.put("101", "green");
        mapBonus.put("102", "green");
        mapBonus.put("103", "green");
        mapBonus.put("105", "green");
        mapBonus.put("106", "green");
        mapBonus.put("107", "green");
        mapBonus.put("108", "green");
        mapBonus.put("109", "green");
        mapBonus.put("1011", "green");
        mapBonus.put("1012", "green");
        mapBonus.put("1013", "green");
        mapBonus.put("1014", "green");


        mapBonus.put("115", "green");
        mapBonus.put("116", "green");
        mapBonus.put("118", "green");
        mapBonus.put("119", "green");
        mapBonus.put("1110", "green");
        mapBonus.put("1112", "green");
        mapBonus.put("1113", "green");
        mapBonus.put("120", "green");
        mapBonus.put("121", "green");
        mapBonus.put("123", "green");
        mapBonus.put("124", "green");
        mapBonus.put("125", "green");
        mapBonus.put("127", "green");
        mapBonus.put("129", "green");
        mapBonus.put("1210", "green");
        mapBonus.put("1211", "green");
        mapBonus.put("1213", "green");
        mapBonus.put("1214", "green");
        mapBonus.put("130", "green");
        mapBonus.put("132", "green");
        mapBonus.put("133", "green");
        mapBonus.put("134", "green");
        mapBonus.put("136", "green");
        mapBonus.put("137", "green");
        mapBonus.put("138", "green");
        mapBonus.put("1310", "green");
        mapBonus.put("1311", "green");
        mapBonus.put("1312", "green");
        mapBonus.put("1314", "green");
        mapBonus.put("141", "green");
        mapBonus.put("142", "green");
        mapBonus.put("144", "green");
        mapBonus.put("145", "green");
        mapBonus.put("146", "green");
        mapBonus.put("148", "green");
        mapBonus.put("149", "green");
        mapBonus.put("1410", "green");
        mapBonus.put("1412", "green");
        mapBonus.put("1413", "green");


        mapBonus.put("77", "star");
        mapBonus.put("00", "red");
        mapBonus.put("07", "red");
        mapBonus.put("014", "red");
        mapBonus.put("70", "red");
        mapBonus.put("714", "red");
        mapBonus.put("140", "red");
        mapBonus.put("147", "red");
        mapBonus.put("1414", "red");

        mapBonus.put("11", "yellow");
        mapBonus.put("113", "yellow");
        mapBonus.put("22", "yellow");
        mapBonus.put("212", "yellow");
        mapBonus.put("33", "yellow");
        mapBonus.put("311", "yellow");
        mapBonus.put("44", "yellow");
        mapBonus.put("410", "yellow");
        mapBonus.put("104", "yellow");
        mapBonus.put("1010", "yellow");
        mapBonus.put("113", "yellow");
        mapBonus.put("1111", "yellow");
        mapBonus.put("122", "yellow");
        mapBonus.put("1212", "yellow");
        mapBonus.put("1313", "yellow");
        mapBonus.put("131", "yellow");

        mapBonus.put("03", "azure");
        mapBonus.put("011", "azure");
        mapBonus.put("26", "azure");
        mapBonus.put("28", "azure");
        mapBonus.put("30", "azure");
        mapBonus.put("37", "azure");
        mapBonus.put("314", "azure");
        mapBonus.put("62", "azure");
        mapBonus.put("66", "azure");
        mapBonus.put("68", "azure");
        mapBonus.put("612", "azure");
        mapBonus.put("73", "azure");
        mapBonus.put("711", "azure");
        mapBonus.put("82", "azure");
        mapBonus.put("86", "azure");
        mapBonus.put("88", "azure");
        mapBonus.put("812", "azure");
        mapBonus.put("110", "azure");
        mapBonus.put("117", "azure");
        mapBonus.put("1114", "azure");
        mapBonus.put("126", "azure");
        mapBonus.put("128", "azure");
        mapBonus.put("143", "azure");
        mapBonus.put("1411", "azure");

        mapBonus.put("15", "blue");
        mapBonus.put("19", "blue");
        mapBonus.put("51", "blue");
        mapBonus.put("55", "blue");
        mapBonus.put("59", "blue");
        mapBonus.put("513", "blue");
        mapBonus.put("91", "blue");
        mapBonus.put("95", "blue");
        mapBonus.put("99", "blue");
        mapBonus.put("913", "blue");
        mapBonus.put("135", "blue");
        mapBonus.put("139", "blue");


    }

    public Tile[][] getTiles() {
        Tile[][] dupTiles = (Tile[][]) Game_Board.clone();
        return dupTiles;
    }

    public boolean wordInBoard(Word word) {   // row or col is outside board bounds
        if (word.getCol() < 0 || word.getCol() > 14 || word.getRow() < 0 || word.getRow() > 14) {
            return false;
        }

        if (word.isVertical()) //if is vertical - there is not enough space for word
        {
            if (word.getRow() + word.getTiles().length > 14) {
                return false;
            }
        }
        // if is not vertical
        else if (word.getCol() + word.getTiles().length > 14) {
            return false;
        }

        // legal word
        return true;
    }


    /* func that help us to check if the word near other tile that
     we put in or tile that include on the board */
    public boolean isContained(Word word, Tile[][] board) {
        int countOverLapping = 0;

        for (int i = 0; i < word.getTiles().length; i++) {
            if (word.isVertical()) {
                //
                if (board[word.getRow() + i][word.getCol()] != null && board[word.getRow() + i][word.getCol()] != word.getTiles()[i])
                    return false;
                else if (board[word.getRow() + i][word.getCol()] == word.getTiles()[i])
                    countOverLapping++;
            } else {
                if (board[word.getRow()][word.getCol() + i] != null && board[word.getRow()][word.getCol() + i] != word.getTiles()[i])
                    return false;
                else if (board[word.getRow()][word.getCol() + i] == word.getTiles()[i])
                    countOverLapping++;

            }
        }

        if (countOverLapping == 0)
            return false;
        return true;
    }

    private boolean firstWord(Word word) {

        int i; // index for rows
        int j; // index for cols
        int wLength = word.getTiles().length;

        if (Game_Board[7][7] != null)
            return false;

        if (word.isVertical() && word.getCol() == 7) {

            int rowIndex = word.getRow(); // index of the first letter in word

            for (i = 0; i < wLength; i++) {

                if (rowIndex + i == 7) // first word valid and one of is tiles at "*";
                    return true;

            }

        } else if (!word.isVertical() && word.getRow() == 7) {

            int colIndex = word.getCol(); // index of the first letter in word

            for (j = 0; j < wLength; j++) {

                if (colIndex + j == 7) // first word valid and one of is tiles at "*";
                    return true;
            }
        }
        return false;
    }

    boolean boardLegal(Word w) {

        if (!wordInBoard(w))
            return false;

        if (Game_Board[7][7] == null) { // first word in the game
            if (!firstWord(w))
                return false;
        }

        if (isContained(w, Game_Board) || isTouchingWord(w))
            return true;

        return false;
    }

    boolean isTouchingWord(Word word) { // checks if the touching word is in dictionary
        ArrayList<Word> tmp = getWords(word);
        for (Word w : tmp)
            if (dictionaryLegal(w))
                return true;
        return false;
    }

    boolean dictionaryLegal(Word word) {
        return true;
    }

    ArrayList<Word> getWords(Word word) {

        ArrayList<Word> optWords = new ArrayList<>();
        optWords.add(word);
        int first, last;
        int wordIndex = 0; // original words index

        Tile[] tileArray;
        if (!word.isVertical()) {


            int loopItr = word.getTiles().length + word.getCol();
            first = word.getRow(); // index of first Tile in word we found on board
            last = word.getRow(); // index of last Tile in  word we found on board

            for (int i = word.getCol(); i < loopItr; i++) // runs through the word - horizontally
            {

                int row = word.getRow();

                if (Game_Board[word.getRow()][i] == word.getTiles()[wordIndex]) {
                    wordIndex++;
                    continue;
                }


                if (Game_Board[row - 1][i] != null) { // goes up on board
                    first = findUpWord(row - 1, i);
                }
                if (Game_Board[row + 1][i] != null) { // goes up on board
                    last = findDownWord(row + 1, i);
                }
                if (last == first) {
                    wordIndex++;
                    continue;
                }
                int lengthWord = last - first + 1;
                tileArray = new Tile[lengthWord]; // create new tile array for new optional word

                int indexTa = 0; // index new tile array

                for (int j = first; j < lengthWord + first; j++) { // create the Word
                    if (Game_Board[j][i] == null) {
                        tileArray[indexTa] = word.getTiles()[wordIndex];

                    } else {
                        Tile newTile = Game_Board[j][i];
                        tileArray[indexTa] = newTile;
                    }
                    indexTa++;


                }
                if (indexTa > 0) {
                    Word newWord = new Word(tileArray, first, i, true);
                    optWords.add(newWord);
                    first = last = word.getRow();
                }
                wordIndex++;
            }

        } else {

            int loopItr = word.getTiles().length + word.getRow();
            first = word.getCol(); // index of first Tile in word we found on board
            last = word.getCol(); // index of last Tile in  word we found on board

            for (int i = word.getRow(); i < loopItr; i++) // runs through the word - vertically
            {

                int col = word.getCol();

                if (Game_Board[i][word.getCol()] == word.getTiles()[wordIndex]) {
                    wordIndex++;
                    continue;
                }


                if (Game_Board[i][col - 1] != null) { // goes right on board
                    first = getFirstCol(i, col - 1);
                }
                if (Game_Board[i][col + 1] != null) { // goes up on board
                    last = getLastCol(i, col + 1);
                }
                if (last == first) {
                    wordIndex++;
                    continue;
                }
                int lengthWord = last - first + 1;
                tileArray = new Tile[lengthWord]; // create new tile array for new optional word

                int indexTa = 0; // index new tile array

                for (int j = first; j < lengthWord + first; j++) { // create the Word
                    if (Game_Board[i][j] == null) {
                        tileArray[indexTa] = word.getTiles()[wordIndex];

                    } else {
                        Tile newTile = Game_Board[i][j];
                        tileArray[indexTa] = newTile;
                    }
                    indexTa++;


                }
                if (indexTa > 0) {
                    Word newWord = new Word(tileArray, i, first, false);
                    optWords.add(newWord);
                    first = last = word.getCol();
                }
                wordIndex++;
            }

        }

        return optWords;
    }

    int findUpWord(int row, int col) { // find start index of word

        while (Game_Board[row - 1][col] != null) {
            row--;
        }
        return row;
    }

    int findDownWord(int row, int col) { // find end index of word
        while (Game_Board[row + 1][col] != null) {
            row++;
        }
        return row;
    }

    private int getLastCol(int row, int col) {
        while (Game_Board[row][col + 1] != null) {
            col++;
        }
        return col;
    }

    private int getFirstCol(int row, int col) {
        while (Game_Board[row][col - 1] != null) {
            col--;
        }
        return col;
    }


    // this func return the score
    public int getScore(Word word) {

        Integer row = word.getRow();
        Integer col = word.getCol();
        int sumScore = 0;
        int mul = 1;
        String indexTileKey;
        for (int i = 0; i < word.getTiles().length; i++) {

            indexTileKey = row.toString() + col.toString();
            String val = mapBonus.get(indexTileKey);

            if (word.isVertical())
                row++;
            else {
                col++;
            }

            if (mapBonus.containsKey(indexTileKey) && word.getTiles()[i] != null) // val is bonus tile
            {
                switch (val) {

                    case ("green"):
                        sumScore += word.getTiles()[i].score;
                        break;

                    case ("red"):
                        mul *= 3;
                        sumScore += word.getTiles()[i].score;

                        break;
                    case ("yellow"):
                        sumScore += word.getTiles()[i].score;
                        mul *= 2;
                        break;
                    case ("star"):
                        sumScore += word.getTiles()[i].score;
                        mul *= 2;
                        mapBonus.replace(indexTileKey, "green");
                        break;

                    case ("azure"):
                        sumScore += word.getTiles()[i].score * 2;
                        break;
                    case ("blue"):
                        sumScore += word.getTiles()[i].score * 3;
                        break;
                }
            } else {
                sumScore += Game_Board[row.intValue()][col.intValue()].score;
            }
        }
        sumScore = sumScore * mul;
        return sumScore;
    }



    // this func try to place the words on the board
    public int tryPlaceWord(Word word) {

        Word myWord = createFullWord(word);

        if (boardLegal(myWord) && dictionaryLegal(myWord)) {


            int addedScore = 0;
            ArrayList<Word> addedWords = getWords(myWord);

            for (Word newWord : addedWords) {
                if (dictionaryLegal(newWord)) {
                    addedScore += getScore(newWord);
                } else //At least one word isn't legal
                {
                    break;
                }
            }

            placeOnTheBoard(word);

            return addedScore;
        }
        return 0;
    }

    Word createFullWord(Word word) {
        Word newWord;

        Tile[] newTile = new Tile[word.getTiles().length];
        if (word.isVertical()) {
            for (int i = 0; i < word.getTiles().length; i++) {
                if (word.getTiles()[i] == null) {
                    newTile[i] = Game_Board[word.getRow() + i][word.getCol()];
                } else {
                    newTile[i] = word.getTiles()[i];
                }
            }
            newWord = new Word(newTile, word.getRow(), word.getCol(), word.isVertical());
            return newWord;

        } else {
            for (int i = 0; i < word.getTiles().length; i++) {
                if (word.getTiles()[i] == null) {
                    newTile[i] = Game_Board[word.getRow()][word.getCol() + i];
                } else {
                    newTile[i] = word.getTiles()[i];
                }
            }
            newWord = new Word(newTile, word.getRow(), word.getCol(), word.isVertical());
            return newWord;

        }
    }

    void placeOnTheBoard(Word word) {

        int row = word.getRow();
        int col = word.getCol();

        if (word.isVertical()) {
            for (int i = 0; i < word.getTiles().length; i++) {
                if (Game_Board[row][col] == null) {
                    Game_Board[row][col] = word.getTiles()[i];
                }
                row += 1;
            }
        } else {
            for (int i = 0; i < word.getTiles().length; i++) {
                if (Game_Board[row][col] == null) {
                    Game_Board[row][col] = word.getTiles()[i];
                }
                col += 1;
            }
        }
    }
}

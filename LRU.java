/*
    Ori Paso - 209493683
 */
package test;

import java.util.LinkedHashSet;

public class LRU implements CacheReplacementPolicy {

    LinkedHashSet<String> allWords;
    public LRU(){

        allWords = new LinkedHashSet<String>();
    }


    @Override
    public void add(String word) {
        allWords.remove(word);
        allWords.add(word);
    }

    @Override
    public String remove() {
        String word = allWords.iterator().next();
        allWords.remove(word);
        return word;
    }



}

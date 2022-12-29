/*
    Ori Paso - 209493683
 */
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Dictionary {
    String[] filenames;
    CacheManager lru;
    CacheManager lfu;
    BloomFilter bl;

    ArrayList<String> saveTheFiles = new ArrayList<>();


    public Dictionary(String... args) {
        filenames = args;
        lru = new CacheManager(400, new LRU());
        lfu = new CacheManager(100, new LFU());
        bl = new BloomFilter(256, "MD5", "Sh1");
        for (String Files : args) {
            loadFiles(Files);
            saveTheFiles.add(Files);
        }
    }


    public void loadFiles(String filename) {
        try {
            Stream<String> stringStream = Files.lines(Paths.get(filename));
            stringStream.forEach(lines -> {
                Stream.of(lines.split("\\W+")).forEach(word -> bl.add(word));
            });
            stringStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean query(String word) {
        if (lru.query(word)) {
            return true;
        }
        if (lfu.query(word)) {
            return false;
        }

        if (bl.contains(word)) {
            lru.add(word);
            return true;
        }
        else{
            lfu.add(word);
            return false;
        }

    }

    public boolean challenge(String word) {
        for (String s : saveTheFiles) {
            if(IOSearcher.search(word, s)) {
                lru.add(word);
                return true;
            }
        }
        lfu.add(word);
        return false;
    }
}


































/*
    Ori Paso - 209493683
 */
package test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IOSearcher {
    public static boolean search(String word, String...fileNames){
        Stream<String> stringStream;
        for (String file : fileNames) {
            try {
                stringStream = Files.lines(Paths.get(file));
                if(stringStream.anyMatch(lines -> lines.contains(word))){
                    return true;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
    }
}

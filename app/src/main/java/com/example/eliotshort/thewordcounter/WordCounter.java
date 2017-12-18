package com.example.eliotshort.thewordcounter;

/**
 * Created by eliotshort on 18/12/2017.
 */

public class WordCounter {

    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty())
        { return 0; }

        String[] words = input.split("\\s+");
        return words.length; }

}

package com.example.eliotshort.thewordcounter;

/**
 * Created by eliotshort on 18/12/2017.
 */

public class WordCounter {

    public static String countWordsUsingSplit(String input) {

        String[] words = input.split("\\s+");
        int theLength = words.length;
        return "The number of words is " + theLength;
    }

}

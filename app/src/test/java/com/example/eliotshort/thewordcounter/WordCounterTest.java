package com.example.eliotshort.thewordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by eliotshort on 18/12/2017.
 */

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before(){
        wordCounter = new WordCounter();
    }

    @Test
    public void canCountWords(){
        assertEquals(wordCounter.countWordsUsingSplit("Fuck you lol"), 3);
    }

}

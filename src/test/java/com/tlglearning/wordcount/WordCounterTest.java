package com.tlglearning.wordcount;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordCounterTest {


  @Test
  void splitWords() {
    WordCounter counter = new WordCounter();
    String input = "The quick brown fox jumps over a lazy dog.";
    String[] expected = {"the","quick","brown","fox","jumps","over","a","lazy","dog"};

    String[] actual = counter.splitWords(input);
    assertArrayEquals(expected, actual);
  }

}
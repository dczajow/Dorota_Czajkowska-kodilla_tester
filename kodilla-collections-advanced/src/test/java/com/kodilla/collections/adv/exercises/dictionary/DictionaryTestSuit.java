package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.Test;

public class DictionaryTestSuit {
    @Test
    public void testAddWord() {
        // given
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";
        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        // when
        dictionary.addWord(polishWord, englishWord);
        // then
        assertEquals(1, dictionary.size());
    }

    private void assertEquals() {
    }
}

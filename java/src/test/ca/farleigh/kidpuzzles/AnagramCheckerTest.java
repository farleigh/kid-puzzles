package ca.farleigh.kidpuzzles;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramCheckerTest {

    @Test
    public void testEmpty() {
        assertTrue(new AnagramChecker().isAnagram(null, null));
        assertTrue(new AnagramChecker().isAnagram("", ""));
    }

    @Test
    public void testSimpleWord() {
        assertTrue(new AnagramChecker().isAnagram("State", "Taste"));
    }

    @Test
    public void testSingleWordToMultipleWords() {
        assertTrue(new AnagramChecker().isAnagram("Anagram", "Nag a ram"));
    }

    @Test
    public void testMultipleWords() {
        assertTrue(new AnagramChecker().isAnagram("The Morse Code ", "Here come dots"));
    }
}

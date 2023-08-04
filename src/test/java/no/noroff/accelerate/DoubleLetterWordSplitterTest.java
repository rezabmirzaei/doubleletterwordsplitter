package no.noroff.accelerate;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DoubleLetterWordSplitterTest {

    private static DoubleLetterWordSplitter doubleLetterWordSplitter;

    @BeforeAll
    static void setup() {
        doubleLetterWordSplitter = new DoubleLetterWordSplitter();
    }

    @Test
    public void testsplitOnDoubleLetter_doubleLetterWord() {
        String[] expected = new String[] { "piz", "za" };
        String[] actual = doubleLetterWordSplitter.splitOnDoubleLetter("Pizza");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testsplitOnDoubleLetter_singleLetterWord() {
        String[] expected = new String[0];
        String[] actual = doubleLetterWordSplitter.splitOnDoubleLetter("Calzone");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testsplitOnDoubleLetter_emptyInput() {
        String[] expected = new String[0];
        String[] actual = doubleLetterWordSplitter.splitOnDoubleLetter("");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testsplitOnDoubleLetter_nullInput() {
        assertThrowsExactly(NullPointerException.class, () -> {
            doubleLetterWordSplitter.splitOnDoubleLetter(null);
        });
    }
}

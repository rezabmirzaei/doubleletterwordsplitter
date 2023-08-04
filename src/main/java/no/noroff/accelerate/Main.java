package no.noroff.accelerate;

import java.util.Arrays;

public class Main {

    private static final DoubleLetterWordSplitter dlws = new DoubleLetterWordSplitter();

    public static void main(String[] args) {
        splitWordAndPrintResult("Letter");
        splitWordAndPrintResult("Happy");
        splitWordAndPrintResult("Shall");
        splitWordAndPrintResult("Tool");
        splitWordAndPrintResult("Mississippi");
        splitWordAndPrintResult("Easy");
    }

    public static void splitWordAndPrintResult(String word) {
        String result = Arrays.toString(dlws.splitOnDoubleLetter(word));
        System.out.println(String.format("splitOnDoubleLetter('%s') -> %s", word, result));
    }
}

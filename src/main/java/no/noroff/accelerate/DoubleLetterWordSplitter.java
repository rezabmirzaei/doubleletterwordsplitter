package no.noroff.accelerate;

import java.util.ArrayList;
import java.util.List;

public class DoubleLetterWordSplitter {

    public String[] splitOnDoubleLetter(String word) {

        if ("".equals(word.trim()))
            return new String[0];

        word = word.toLowerCase();

        List<String> result = new ArrayList<>();
        int startIndex = 0;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                result.add(word.substring(startIndex, i));
                startIndex = i;
            }
        }

        if (startIndex > 0)
            result.add(word.substring(startIndex));

        return result.toArray(new String[0]);
    }

}

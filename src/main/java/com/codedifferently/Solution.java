package com.codedifferently;

import java.util.HashMap;

public class Solution {
    public String howManyLettersDoYouSee(String input) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] stringArray = input.toCharArray();

        for (char ch : stringArray) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }
        return charCount.toString();
    }
}

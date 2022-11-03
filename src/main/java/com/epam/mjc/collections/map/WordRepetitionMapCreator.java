package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        if (sentence.isEmpty()) return result;
        sentence = sentence.toLowerCase(Locale.ENGLISH);
        for (String s : sentence.split(", |[ .,]")) {
            if (result.computeIfPresent(s, (k,v) -> v+1) != null) continue;
            result.put(s, 1);
        }
        return result;
    }
}

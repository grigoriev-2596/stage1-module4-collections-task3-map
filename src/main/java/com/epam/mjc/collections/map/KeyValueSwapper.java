package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapped = new HashMap<>();
        for(Map.Entry<Integer, String> e : sourceMap.entrySet()) {
            String value = e.getValue();
            Integer key = e.getKey();
            if (swapped.containsKey(value) && key < swapped.get(value)) {
                swapped.put(value, key);
                continue;
            }
            swapped.put(value, key);
        }
        return swapped;
    }
}

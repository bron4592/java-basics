package com.company.frequency;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static Map<String, Integer> countFrequency(String[] names){
        Map<String,Integer> freqMap = new HashMap<String, Integer>();

        for (String name : names) {
            if (freqMap.containsKey(name)) {
                int temp = freqMap.get(name) + 1;
                freqMap.put(name, temp);
            } else {
                freqMap.put(name, 1);
            }
        }
        return freqMap;
    }

}

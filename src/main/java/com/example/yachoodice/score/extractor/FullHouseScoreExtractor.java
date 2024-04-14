package com.example.yachoodice.score.extractor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FullHouseScoreExtractor implements ScoreExtractor {
    @Override
    public int extract(List<Integer> eyes) {
        int sum = 0;
        Map<Integer, Integer> eyeCountMap = new HashMap<>();
        for (int eye : eyes) {
            sum += eye;
            Integer count = eyeCountMap.get(eye);
            if (count == null) {
                count = 0;
            }
            eyeCountMap.put(eye, count+1);
        }
        if (eyeCountMap.size() > 2)
            return 0;
        for (int count : eyeCountMap.values()) {
            if (count != 2 && count != 3 && count != 5) {
                return 0;
            }
        }
        return sum;
    }
}

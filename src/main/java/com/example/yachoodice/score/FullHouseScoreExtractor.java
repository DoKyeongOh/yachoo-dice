package com.example.yachoodice.score;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FullHouseScoreExtractor extends ScoreExtractor {
    @Override
    protected int extract(List<Integer> eyes) throws ScoreExtractException {
        if (eyes.size() != EYES_SIZE)
            throw new ScoreExtractException("bad input eyes size");
        int sum = 0;
        Map<Integer, Integer> eyeCountMap = new HashMap<>();
        for (int eye : eyes) {
            sum += eye;
            Integer count = eyeCountMap.get(eye);
            if (count == null) {
                count = 0;
                eyeCountMap.put(eye, count);
            }
            eyeCountMap.put(eye, count+1);
        }
        if (eyeCountMap.size() == 2)
            return sum;
        return 0;
    }
}

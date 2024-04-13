package com.example.yachoodice.score;

import java.util.List;

public class SpecificCountScoreExtractor extends ScoreExtractor {
    private int count;

    public SpecificCountScoreExtractor(int count) {
        this.count = count;
    }

    @Override
    protected int extract(List<Integer> eyes) throws ScoreExtractException {
        if (eyes.size() != EYES_SIZE)
            throw new ScoreExtractException("bad input eyes size");
        int sum = 0;
        int[] counts = new int[6];
        for (int eye : eyes) {
            counts[eye-1]++;
            sum += eye;
        }
        for (int i=5 ; i>=0 ; i--) {
            if (counts[i] >= count) {
                return sum;
            }
        }
        return 0;
    }
}

package com.example.yachoodice.score.extractor;

import com.example.yachoodice.score.ScoreExtractException;

import java.util.List;

public class SpecificCountScoreExtractor implements ScoreExtractor {
    private int count;

    public SpecificCountScoreExtractor(int count) {
        this.count = count;
    }

    @Override
    public int extract(List<Integer> eyes) {
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

package com.example.yachoodice.score.extractor;

import com.example.yachoodice.score.ScoreExtractException;

import java.util.List;

public class SameEyesScoreExtractor implements ScoreExtractor {
    private int eyeNo = 0;

    public SameEyesScoreExtractor(int eyeNo) {
        this.eyeNo = eyeNo;
    }

    @Override
    public int extract(List<Integer> eyes) {
        int count = (int) eyes.stream().filter(eye -> eye == eyeNo).count();
        return count * eyeNo;
    }
}

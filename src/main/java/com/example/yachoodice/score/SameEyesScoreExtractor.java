package com.example.yachoodice.score;

import java.util.List;

public class SameEyesScoreExtractor extends ScoreExtractor {
    private int eyeNo = 0;

    public SameEyesScoreExtractor(int eyeNo) {
        this.eyeNo = eyeNo;
    }

    @Override
    protected int extract(List<Integer> eyes) throws ScoreExtractException {
        if (eyes.size() != EYES_SIZE)
            throw new ScoreExtractException("bad input eyes size");
        int count = (int) eyes.stream().filter(eye -> eye == eyeNo).count();
        return count * eyeNo;
    }
}

package com.example.yachoodice.score;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SameEyesScoreExtractorTest {
    @Test
    public void testExtractOneCombo() throws ScoreExtractException {
        List<Integer> eyes = new ArrayList<>();
        eyes.add(1);
        eyes.add(1);
        eyes.add(1);
        eyes.add(1);
        eyes.add(1);
        SameEyesScoreExtractor scoreExtractor = new SameEyesScoreExtractor(1);
        assert scoreExtractor.extract(eyes) == 5;
        eyes.remove(0);
        eyes.add(2);
        assert scoreExtractor.extract(eyes) == 4;
        eyes.remove(0);
        eyes.add(2);
        assert scoreExtractor.extract(eyes) == 3;
        eyes.remove(0);
        eyes.add(2);
        assert scoreExtractor.extract(eyes) == 2;
        eyes.remove(0);
        eyes.add(2);
        assert scoreExtractor.extract(eyes) == 1;
        eyes.remove(0);
        eyes.add(2);
        assert scoreExtractor.extract(eyes) == 0;
    }
    @Test
    public void testExtractSixCombo() throws ScoreExtractException {
        List<Integer> eyes = new ArrayList<>();
        eyes.add(6);
        eyes.add(6);
        eyes.add(6);
        eyes.add(6);
        eyes.add(6);
        SameEyesScoreExtractor scoreExtractor = new SameEyesScoreExtractor(6);
        assert scoreExtractor.extract(eyes) == 30;
        eyes.remove(0);
        eyes.add(3);
        assert scoreExtractor.extract(eyes) == 24;
        eyes.remove(0);
        eyes.add(3);
        assert scoreExtractor.extract(eyes) == 18;
        eyes.remove(0);
        eyes.add(3);
        assert scoreExtractor.extract(eyes) == 12;
        eyes.remove(0);
        eyes.add(3);
        assert scoreExtractor.extract(eyes) == 6;
        eyes.remove(0);
        eyes.add(3);
        assert scoreExtractor.extract(eyes) == 0;
    }
}
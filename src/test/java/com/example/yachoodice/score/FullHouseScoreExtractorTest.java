package com.example.yachoodice.score;

import com.example.yachoodice.score.extractor.FullHouseScoreExtractor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FullHouseScoreExtractorTest {
    @Test
    public void test() {
        List<Integer> eyes = new ArrayList<>();
        eyes.add(1);
        eyes.add(1);
        eyes.add(1);
        eyes.add(1);
        eyes.add(1);
        FullHouseScoreExtractor scoreExtractor = new FullHouseScoreExtractor();
        assert scoreExtractor.extract(eyes) == 5;
        eyes.remove(0);
        eyes.add(2);
        assert scoreExtractor.extract(eyes) == 0;
        eyes.remove(0);
        eyes.add(2);
        assert scoreExtractor.extract(eyes) == 7;

    }
}
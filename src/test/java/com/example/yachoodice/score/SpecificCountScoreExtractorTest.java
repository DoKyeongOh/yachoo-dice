package com.example.yachoodice.score;


import com.example.yachoodice.score.extractor.SpecificCountScoreExtractor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SpecificCountScoreExtractorTest {
    @Test
    public void testThreeCountCombo() throws ScoreExtractException {
        List<Integer> eyes = new ArrayList<>();
        eyes.add(2);
        eyes.add(2);
        eyes.add(2);
        eyes.add(2);
        eyes.add(2);
        SpecificCountScoreExtractor threeCountExtractor = new SpecificCountScoreExtractor(3);
        assert threeCountExtractor.extract(eyes) == 10;
        eyes.remove(0);
        eyes.add(6);
        assert threeCountExtractor.extract(eyes) == 14;//22226
        eyes.remove(0);
        eyes.add(6);
        assert threeCountExtractor.extract(eyes) == 18;//22266
        eyes.remove(0);
        eyes.add(6);
        assert threeCountExtractor.extract(eyes) == 22;//22666
        eyes.remove(0);
        eyes.add(6);
        assert threeCountExtractor.extract(eyes) == 26;//26666
        eyes.remove(0);
        eyes.add(6);
        assert threeCountExtractor.extract(eyes) == 30;//66666
        eyes.remove(0);
        eyes.remove(0);
        eyes.remove(0);
        eyes.add(1);
        eyes.add(2);
        eyes.add(3);
        assert threeCountExtractor.extract(eyes) == 0;//66123
    }
    @Test
    public void testFourCountCombo() throws ScoreExtractException {
        List<Integer> eyes = new ArrayList<>();
        eyes.add(2);
        eyes.add(2);
        eyes.add(2);
        eyes.add(2);
        eyes.add(2);
        SpecificCountScoreExtractor threeCountExtractor = new SpecificCountScoreExtractor(4);
        assert threeCountExtractor.extract(eyes) == 10;
        eyes.remove(0);
        eyes.add(6);
        assert threeCountExtractor.extract(eyes) == 14;//22226
        eyes.remove(0);
        eyes.add(6);
        assert threeCountExtractor.extract(eyes) == 0;//22266
        eyes.remove(0);
        eyes.add(6);
        assert threeCountExtractor.extract(eyes) == 0;//22666
        eyes.remove(0);
        eyes.add(6);
        assert threeCountExtractor.extract(eyes) == 26;//26666
        eyes.remove(0);
        eyes.add(6);
        assert threeCountExtractor.extract(eyes) == 30;//66666
        eyes.remove(0);
        eyes.remove(0);
        eyes.add(1);
        eyes.add(2);
        assert threeCountExtractor.extract(eyes) == 0;//66612
    }
}
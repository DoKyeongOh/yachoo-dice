package com.example.yachoodice.score;

import java.util.List;

public class ScoreExtractorFactory {
    public ScoreExtractor getInstance(String combinationId) {
        switch (combinationId.toLowerCase()) {
            case "one-combo": return new SameEyesScoreExtractor(1);
            case "two-combo": return new SameEyesScoreExtractor(2);
            case "three-combo": return new SameEyesScoreExtractor(3);
            case "four-combo": return new SameEyesScoreExtractor(4);
            case "five-combo": return new SameEyesScoreExtractor(5);
            case "six-combo": return new SameEyesScoreExtractor(6);
            default: return new AlwaysZeroScoreExtractor();
        }
    }

    private static class AlwaysZeroScoreExtractor extends ScoreExtractor {
        @Override
        protected int extract(List<Integer> eyes) throws ScoreExtractException {
            return 0;
        }
    }
}

package com.example.yachoodice.score;

import java.util.List;

public abstract class ScoreExtractor {
    protected static final int EYES_SIZE = 5;
    protected abstract int extract(List<Integer> eyes) throws ScoreExtractException;
}

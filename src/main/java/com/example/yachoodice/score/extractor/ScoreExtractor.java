package com.example.yachoodice.score.extractor;

import com.example.yachoodice.score.ScoreExtractException;

import java.util.List;

public interface ScoreExtractor {
    public abstract int extract(List<Integer> eyes);
}

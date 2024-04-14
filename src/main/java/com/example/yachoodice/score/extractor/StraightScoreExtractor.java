package com.example.yachoodice.score.extractor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StraightScoreExtractor implements ScoreExtractor {
    private boolean isBigStraight;
    private List<List<Integer>> bigStraightItems = new ArrayList<>();
    private List<List<Integer>> smallStraightItems = new ArrayList<>();
    public StraightScoreExtractor(boolean isBigStraight) {
        this.isBigStraight = isBigStraight;
        bigStraightItems.add(new ArrayList<>());
        bigStraightItems.get(0).addAll(Arrays.asList(1, 2, 3, 4, 5));
        bigStraightItems.add(new ArrayList<>());
        bigStraightItems.get(1).addAll(Arrays.asList(2, 3, 4, 5, 6));
        smallStraightItems.add(new ArrayList<>());
        smallStraightItems.get(0).addAll(Arrays.asList(1, 2, 3, 4));
        smallStraightItems.add(new ArrayList<>());
        smallStraightItems.get(1).addAll(Arrays.asList(2, 3, 4, 5));
        smallStraightItems.add(new ArrayList<>());
        smallStraightItems.get(2).addAll(Arrays.asList(3, 4, 5, 6));
    }
    @Override
    public int extract(List<Integer> eyes) {
        Set<Integer> eyeSet = new HashSet<>(eyes);
        if (isBigStraight) {
            for (List<Integer> items : bigStraightItems) {
                if (!eyeSet.containsAll(items)) {
                    return 0;
                }
            }
        } else {
            for (List<Integer> items : smallStraightItems) {
                if (!eyeSet.containsAll(items)) {
                    return 0;
                }
            }
        }
        return 0;
    }
}

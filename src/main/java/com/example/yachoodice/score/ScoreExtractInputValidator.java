package com.example.yachoodice.score;

import java.util.List;

public class ScoreExtractInputValidator {
    public static final Integer EYES_SIZE = 5;
    public static final Integer EYE_VALUE_LIMIT = 6;
    public boolean validate(List<Integer> eyes) {
        if (eyes == null || eyes.size() != EYES_SIZE) {
            return false;
        }
        for (Integer eye : eyes) {
            if (eye == null || eye <= 0 || eye > EYE_VALUE_LIMIT) {
                return false;
            }
        }
        return true;
    }

}

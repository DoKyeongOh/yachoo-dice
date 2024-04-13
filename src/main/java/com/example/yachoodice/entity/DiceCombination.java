package com.example.yachoodice.entity;

import lombok.Data;

@Data
public class DiceCombination {
    private String id;
    private String name;
    private DiceCombinationType type;

    public enum DiceCombinationType {
        MAJOR, MINOR
    }
}

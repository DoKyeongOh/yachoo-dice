package com.example.yachoodice.entity;

import lombok.Data;

@Data
public class Profile {
    private String profileId;
    private String nickname;
    private String userId;
    private PersonalRecord personalRecord;

    @Data
    public static class PersonalRecord {
        private long winCount;
        private long playCount;
    }
}

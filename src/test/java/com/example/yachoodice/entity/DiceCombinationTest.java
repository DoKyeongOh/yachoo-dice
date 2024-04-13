package com.example.yachoodice.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DiceCombinationTest {
    @Test
    public void test() throws JsonProcessingException {
        DiceCombination diceCombination1 = new DiceCombination();
        diceCombination1.setId("one-combo");
        diceCombination1.setName("1 콤보");
        diceCombination1.setType(DiceCombination.DiceCombinationType.MINOR);
        DiceCombination diceCombination2 = new DiceCombination();
        diceCombination2.setId("two-combo");
        diceCombination2.setName("2 콤보");
        diceCombination2.setType(DiceCombination.DiceCombinationType.MINOR);
        List<DiceCombination> diceCombinations = new ArrayList<>();
        diceCombinations.add(diceCombination1);
        diceCombinations.add(diceCombination2);
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(diceCombinations);
        System.out.println(jsonString);
    }
}
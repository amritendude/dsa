package com.scaler.module01.allsubarrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenerateAllSubArraysTest {
    @Test
    void testAllSubArrays() {
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(5)));
        B.add(new ArrayList<>(Arrays.asList(5,2)));
        B.add(new ArrayList<>(Arrays.asList(5,2,1)));
        B.add(new ArrayList<>(Arrays.asList(5,2,1,4)));
        B.add(new ArrayList<>(Arrays.asList(2)));
        B.add(new ArrayList<>(Arrays.asList(2,1)));
        B.add(new ArrayList<>(Arrays.asList(2,1,4)));
        B.add(new ArrayList<>(Arrays.asList(1)));
        B.add(new ArrayList<>(Arrays.asList(1,4)));
        B.add(new ArrayList<>(Arrays.asList(4)));


        assertEquals(B,
                new GenerateAllSubArrays().solve(new ArrayList<>(Arrays.asList(5, 2, 1, 4))));
    }
}

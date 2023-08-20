package com.scaler.module01.sumallsubarrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumSubArraysTest {

    @Test
    void testSum() {
        assertEquals(19L,
                new SumSubArrays().solve(new ArrayList<>(Arrays.asList(2, 1, 3))));
    }
}

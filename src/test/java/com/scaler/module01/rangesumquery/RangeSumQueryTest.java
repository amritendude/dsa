package com.scaler.module01.rangesumquery;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSumQueryTest {

    @Test
    void testRangeSumQuery() {
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(0,3)));
        B.add(new ArrayList<>(Arrays.asList(1,2)));
        assertEquals(new ArrayList<>(Arrays.asList(10L,5L)),
                new RangeSumQuery().solve(new ArrayList<>(Arrays.asList(1, 2, 3, 4,5)), B));
    }
}

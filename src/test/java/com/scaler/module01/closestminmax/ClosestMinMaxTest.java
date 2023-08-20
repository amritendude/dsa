package com.scaler.module01.closestminmax;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClosestMinMaxTest {

    @Test
    void testClosestMinMax() {
        assertEquals(3,
                new ClosestMinMax().solve(new ArrayList<>(Arrays.asList(2, 6, 1, 6, 9))));
    }
}

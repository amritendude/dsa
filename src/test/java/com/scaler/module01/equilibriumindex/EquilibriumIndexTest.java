package com.scaler.module01.equilibriumindex;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquilibriumIndexTest {

    @Test
    void testEquilibriumIndex() {
        assertEquals(3,
                new EquilibriumIndex().solve(new ArrayList<>(Arrays.asList(-7, 1, 5, 2, -4, 3, 0))));
    }
}

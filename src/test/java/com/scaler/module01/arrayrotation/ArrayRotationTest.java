package com.scaler.module01.arrayrotation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayRotationTest {
    @Test
    void testArrayRotation() {
        assertEquals(new ArrayList<>(Arrays.asList(3, 4, 1, 2)),
                new ArrayRotation().solve(new ArrayList<>(Arrays.asList(1, 2, 3, 4)), 2));
    }

}

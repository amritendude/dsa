package com.isprime.module01.isprime;

import com.scaler.module01.isprime.IsPrime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsPrimeTest {

    @Test
    void testPrime() {
        assertEquals(1,
                new IsPrime().solve(5));
    }
    @Test
    void testNotPrime() {
        assertEquals(0,
                new IsPrime().solve(8));
    }
}

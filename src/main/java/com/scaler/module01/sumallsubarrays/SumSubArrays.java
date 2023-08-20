package com.scaler.module01.sumallsubarrays;

import java.util.ArrayList;

/*
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.
 */
public class SumSubArrays {
    public Long solve(ArrayList<Integer> A) {
        long sum = 0;
        for (int iCtr = 0; iCtr < A.size(); iCtr++)
        {
            long a = iCtr + 1;
            long b = A.size()-iCtr;
            long c = Long.valueOf(A.get(iCtr));
            sum += a*b*c;
        }
        return sum;
    }
}

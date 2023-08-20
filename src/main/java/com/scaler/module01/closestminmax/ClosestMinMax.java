package com.scaler.module01.closestminmax;

import java.util.ArrayList;
/*
Given an array A, find the size of the smallest subarray
such that it contains at least one occurrence of the maximum value of the array
and at least one occurrence of the minimum value of the array.
 */
public class ClosestMinMax {
    public int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (Integer a : A)
        {
            if (a>max)
                max = a;
            if (a<min)
                min = a;
        }
        if (min==max) return 1;
        int cmin=-1, cmax=-1, ans=A.size();
        for (int iCtr = 0; iCtr < A.size(); iCtr++)
        {
            if (A.get(iCtr)==min)
            {
                cmin=iCtr;
                if (cmax!=-1)
                {
                    if (ans > iCtr - cmax + 1)
                        ans = iCtr - cmax + 1;
                }
            }
            if (A.get(iCtr)==max)
            {
                cmax=iCtr;
                if (cmin!=-1)
                {
                    if (ans > iCtr - cmin + 1)
                        ans = iCtr - cmin + 1;
                }
            }

        }
        return ans;
    }
}

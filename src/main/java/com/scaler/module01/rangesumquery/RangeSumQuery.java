package com.scaler.module01.rangesumquery;

import java.util.ArrayList;
/*
Input 1:
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
Output 1:
[10, 5]

Input 2:
A = [2, 2, 2]
B = [[0, 0], [1, 2]]
Output 2:
[2, 4]
 */
public class RangeSumQuery {
    public ArrayList<Long> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        Long[] pf = new Long[A.size()];
        pf[0] = new Long(A.get(0));
        for (int iCtr = 1; iCtr < A.size(); iCtr++)
            pf[iCtr] = pf[iCtr-1] + A.get(iCtr);

        ArrayList<Long> sum = new ArrayList<>();
        for (ArrayList<Integer> range: B)
        {
            int left = range.get(0);
            int right = range.get(1);

            long sumrange = (left==0)?pf[right]:pf[right] - pf[left-1];

            sum.add(sumrange);
        }
        return sum;
    }
}

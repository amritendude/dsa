package com.scaler.module01.equilibriumindex;

import java.util.ArrayList;

/*
You are given an array A of integers of size N.
Your task is to find the equilibrium index of the given array
The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

Note:
Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.
 */
public class EquilibriumIndex {
       public int solve(ArrayList<Integer> A) {
            Integer[] pf = new Integer[A.size()];
            pf[0] = A.get(0);
            for (int iCtr = 1; iCtr < A.size(); iCtr++)
                pf[iCtr] = pf[iCtr - 1] + A.get(iCtr);

            if (pf[A.size() - 1] - pf[0] == 0) return 0;

            for (int iCtr = 1; iCtr < A.size(); iCtr++) {
                if (pf[iCtr - 1] == (pf[A.size() - 1] - pf[iCtr]))
                    return iCtr;
            }
            return -1;
        }
}

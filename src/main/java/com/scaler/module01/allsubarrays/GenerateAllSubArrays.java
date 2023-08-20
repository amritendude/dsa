package com.scaler.module01.allsubarrays;

import java.util.ArrayList;

public class GenerateAllSubArrays {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList all = new ArrayList();
        for (int iCtr = 0; iCtr < A.size(); iCtr++)
        {
            for (int jCtr = iCtr; jCtr < A.size(); jCtr++)
            {
                ArrayList<Integer> arr2d = new ArrayList<Integer>();
                for (int kCtr = iCtr; kCtr <= jCtr; kCtr++)
                {
                    arr2d.add(A.get(kCtr));
                }
                all.add(arr2d);
            }
        }
        return all;
    }


}

package com.scaler.module01.arrayrotation;

import java.util.ArrayList;

public class ArrayRotation {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        B = B % A.size();
        A = reverse(A, 0, A.size()-1);
        A = reverse(A, 0, B-1);
        A = reverse(A, B, A.size()-1);
        return A;
    }
    public ArrayList<Integer> reverse(ArrayList<Integer> A, int B, int C) {
        int i = B, j = C;
        while (i < j)
        {
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
            i++;
            j--;
        }
        return A;
    }
}

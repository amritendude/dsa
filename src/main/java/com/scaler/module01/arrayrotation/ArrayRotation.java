package com.scaler.module01.arrayrotation;

import java.util.ArrayList;

/*
Given an integer array A of size N and an integer B,
you have to return the same array after rotating it B times towards the right.
Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]
 */
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

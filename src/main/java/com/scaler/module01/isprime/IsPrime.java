package com.scaler.module01.isprime;

public class IsPrime {
    public int solve(long A) {
        int count = 0;
        for (long iCtr = 1; iCtr*iCtr<=A; iCtr++)
        {
            if (A%iCtr==0)
            {
                if (iCtr!=A/iCtr)
                    count+=2;
                else
                    count++;
            }
        }
        if (count==2)
            return 1;
        return 0;
    }
}

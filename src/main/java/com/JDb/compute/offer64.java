package com.JDb.compute;

public class offer64 {

    public int sumNums(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumNums(n - 1);
    }
}

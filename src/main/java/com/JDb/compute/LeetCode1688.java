package com.JDb.compute;

public class LeetCode1688 {
    int rs = 0;

    public int numberOfMatches(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            rs += n / 2;
            numberOfMatches(n / 2);
        } else {
            rs += (n - 1) / 2;
            numberOfMatches((n - 1) / 2 + 1);
        }
        return rs;
    }
}

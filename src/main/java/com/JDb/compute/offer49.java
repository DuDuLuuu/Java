package com.JDb.compute;

import java.util.HashSet;

public class offer49 {
    public static void main(String[] args) {
        offer49 offer49 = new offer49();
        System.out.println(offer49.nthUglyNumber(11));
    }

    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        arr[0] = 1;

        int a = 0, b = 0, c = 0;
        for (int i = 1; i < n; i++) {
            int temp = Math.min(arr[a] * 2, arr[b] * 3);
            temp = Math.min(temp, arr[c] * 5);
            if (temp == arr[a] * 2) {
                a++;
            }
            if (temp == arr[b] * 3) {
                b++;
            }
            if (temp == arr[c] * 5) {
                c++;
            }
            arr[i] = temp;

        }
        return arr[n - 1];

    }
}

package com.JDb.compute;

public class LeetCode42 {
    int rs = 0;

    public int trap(int[] height) {
        int left, right = -1;
        for (int i = 0; i < height.length; ) {
            if (height[i] > 0) {
                left = i;
                //找比left高的
                int rightMax = 0;
                int rightMaxIndex = -1;
                for (int j = i + 1; j < height.length; j++) {
                    if (height[j] > rightMax) {
                        rightMaxIndex = j;
                        rightMax = height[j];
                    }

                    if (height[j] >= height[left]) {
                        right = j;
                        break;
                    }
                }
                //找不到比left高的 找比left矮的里面最高的
                if (right == -1 && rightMax != 0 && rightMaxIndex - left != 1) {
                    right = rightMaxIndex;
                    calc(height, left, right);
                    i = right;
                    right = -1;
                    continue;
                }
                if (right != -1) {
                    if (right - left != 1) {
                        calc(height, left, right);
                    }
                    i = right;
                    right = -1;
                } else {
                    i++;
                }

            } else {
                i++;
            }
        }

        return rs;
    }

    private void calc(int[] height, int left, int right) {
        int max = Math.min(height[left], height[right]);
        int width = right - left - 1;
        int sum = 0;
        for (int i = left + 1; i < right; i++) {
            sum += height[i];

        }
        rs += (max * width - sum);
    }

}

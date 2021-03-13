package com.JDb.compute;

/**
 * @Author:JDb
 * @Date:2019/9/6
 */


/**
 * 有一个二维矩阵 A 其中每个元素的值为 0 或 1 。
 * 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
 * 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
 * 返回尽可能高的分数。
 * 示例：
 * <p>
 * 输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * 输出：39
 * 解释：
 * 转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]
 * 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/score-after-flipping-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode861 {
    public int matrixScore(int[][] A) {
        int y = A.length;
        int x = A[0].length;

        for (int i = 0; i < y; i++) {
            if (A[i][0] == 0) {
                for (int j = 0; j < x ; j++) {
                    if (A[i][j] == 1) {
                        A[i][j] = 0;
                    } else {
                        A[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 1; i < x; i++) {
            int sum = 0;
            for (int j = 0; j < y; j++) {
                if (A[j][i] == 1) {
                    sum++;
                }
            }
            if (sum <= y / 2) {
                for (int j = 0; j < y ; j++) {
                    if (A[j][i] == 1) {
                        A[j][i] = 0;
                    } else {
                        A[j][i] = 1;
                    }
                }
            }
        }
        Double rs = 0d;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (A[i][j] == 1) {
                    rs += Math.pow(2, x - 1 - j);
                }
            }
        }
        return rs.intValue();
    }
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}};
//        int[][] arr = new int[][]{{1,1},{1,1},{0,1}};
        LeetCode861 obj = new LeetCode861();
        int i = obj.matrixScore(arr);
        System.out.println(i);
    }

}



















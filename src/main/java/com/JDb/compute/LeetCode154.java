package com.JDb.compute;

/**
 * @Author:JDb
 * @Date:2019/9/4
 */

/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 请找出其中最小的元素。
 * 注意数组中可能存在重复的元素。
 * 示例 1：
 * 输入: [1,3,5]
 * 输出: 1
 * 示例 2：
 * 输入: [2,2,2,0,1]
 * 输出: 0
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode154 {
    public int findMin(int[] nums) {
        int min = 0, max = nums.length - 1;
        while (min < max) {
            int mid = min + (max - min) / 2;
            if (nums[mid] > nums[max]) {
                min = mid + 1;
            } else if (nums[mid] < nums[max]) {
                max = mid;
            } else {
                max--;
            }
        }
        return nums[min];
    }


    public static void main(String[] args) {

        int[] arr = new int[]{4, 5, 6, 7, 0, 1, 2};
        LeetCode154 obj = new LeetCode154();
        int rs = obj.findMin(arr);
        System.out.println(rs);
    }
}

package com.project.algorithms;

/**
 * @author liguang
 * @date 2020/12/4
 */
public class Leetcode_283 {
    /**
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int pointA = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[pointA];
                nums[pointA++] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Leetcode_283 ts = new Leetcode_283();
        ts.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}

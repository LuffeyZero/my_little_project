package com.project.algorithms;

/**
 * @author liguang
 * @date 2020/12/4
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 */
public class Leetcode_189 {
    /**
     * 旋转数组
     *
     * @param nums 数组
     * @param k    位置
     */
    public void rotate(int[] nums, int k) {
        int index = k % nums.length;
        // 先全部反转一次
        reverse(nums, 0, nums.length - 1);
        // 反转前面的数
        reverse(nums, 0, index - 1);
        // 反转后面的数
        reverse(nums, index, nums.length - 1);
    }

    // 反转数组
    public void reverse(int[] nums, int start, int stop) {
        while (start < stop) {
            int temp = nums[start];
            nums[start] = nums[stop];
            nums[stop] = temp;
            start++;
            stop--;
        }
    }
}

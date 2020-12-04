package com.project.algorithms;

/**
 * @author liguang
 * @date 2020/12/4
 * 删除排序数组中的重复项
 */
public class Leetcode_26 {
    /**
     *给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * 题解：
     *  因为需要原地删除重复出现的元素，则不能采用双指针只计数不覆盖的方式，必须在遇到不同的元素的时候，进行赋值平移，盖掉相同的元素，
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int pointA = 0;
        int j = 1;
        for (; j < nums.length; j++) {
            if (nums[pointA] != nums[j]) {
                pointA++;
                nums[pointA] = nums[j];
            }
        }
        return pointA + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = new int[]{0, 0, 1};
        Leetcode_26 t = new Leetcode_26();
        System.out.println(t.removeDuplicates(nums));
    }
}

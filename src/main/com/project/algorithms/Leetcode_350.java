package com.project.algorithms;

import java.util.Arrays;

/**
 * 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * @author liguang
 * @date 2020/12/4
 */
public class Leetcode_350 {
    /**
     * 求数组的交集
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = Math.max(len1, len2);

        int[] res = new int[len];
        int index = 0, pointA = 0, pointB = 0;
        // 越界即停止
        while (pointA < len1 && pointB < len2) {
            if (nums1[pointA] > nums2[pointB]) {
                pointB++;
            } else if (nums1[pointA] < nums2[pointB]) {
                pointA++;
            } else {
                res[index] = nums1[pointA];
                pointA++;
                pointB++;
                index++;
            }
        }

        return Arrays.copyOfRange(res, 0, index);

    }
}

package com.project.algorithms;

/**
 * @author liguang
 * @date 2020/12/4
 * <p>
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode_66 {
    /**
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        for (int length = digits.length - 1; length >= 0; length--) {
            digits[length]++;
            digits[length] = digits[length] % 10;
            if (digits[length] != 0) {
                return digits;
            }
        }
        //如果走到这来了，说明第一个数也是9，需要添加一位
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

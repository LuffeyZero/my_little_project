package com.project.algorithms;

/**
 * @author liguang
 * @date 2020/12/19
 */
public class Leetcode_344 {

    public void reverseString(char[] s) {
        int end = s.length - 1;
        for (int i = 0; i < s.length; i++) {
            if (i >= end) {
                break;
            }
            char temp = s[i];
            s[i] = s[end];
            s[end--] = temp;
        }
    }

    public static void main(String[] args) {
        Leetcode_344 a=new Leetcode_344();
        a.reverseString(new char[]{'a','m','s','l'});
    }
}

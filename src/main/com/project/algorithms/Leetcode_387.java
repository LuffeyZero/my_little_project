package com.project.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liguang
 * @date 2020/12/19
 */
public class Leetcode_387 {
    /**
     * 构建哈希表的解法
     *
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        //
        int length = s.length();
        Map<Character, Integer> charMap = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            charMap.put(s.charAt(i), charMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        // 再次便利查看只有一个的字符
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (charMap.get(c) == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 第二种方式
     *
     * @param s
     * @return
     */
    public int firstUniqChar2(String s) {
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }
}

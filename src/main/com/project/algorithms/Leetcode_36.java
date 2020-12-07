package com.project.algorithms;

import java.util.HashMap;

/**
 * @author liguang
 * @date 2020/12/4
 */
public class Leetcode_36 {
    public boolean isValidSudoku(char[][] board) {
        // 先构建三个方向的map
        HashMap<Integer, Integer>[] rows = new HashMap[9];
        HashMap<Integer, Integer>[] cols = new HashMap[9];
        HashMap<Integer, Integer>[] boxes = new HashMap[9];

        // 构建9个元素数据位置
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<Integer, Integer>();
            cols[i] = new HashMap<Integer, Integer>();
            boxes[i] = new HashMap<Integer, Integer>();
        }

        // 横向和纵向两侧循环
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char nums = board[i][j];
                // 空格越过
                if (nums != '.') {
                    int num = (int) nums;
                    int box = (i / 3) * 3 + j / 3;

                    rows[i].put(num, rows[i].getOrDefault(num, 0) + 1);
                    cols[j].put(num, cols[j].getOrDefault(num, 0) + 1);
                    boxes[box].put(num, boxes[box].getOrDefault(num, 0) + 1);

                    if (rows[i].get(num) > 1 || cols[j].get(num) > 1 || boxes[box].get(num) > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

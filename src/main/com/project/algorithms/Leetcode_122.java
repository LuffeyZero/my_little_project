package com.project.algorithms;

/**
 * @author liguang
 * @date 2020/12/4
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * <p>
 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 * <p>
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode_122 {
    /**
     * 双指针形式
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 0; i < n; i++) {
            // 今天不持有的最大收益= 昨天持有+今天卖了的钱，或者昨天就不持有的累计收益
            dp[i][0] = Math.max(dp[i - 1][1] + prices[i], dp[i - 1][0]);
            // 今天持有的最大收益 = 昨天不持有 - 今天买了的钱，或者昨天就持有的累计收益
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
        }

        // 持有的收益 一定小于不持有的收益
        return dp[n - 1][0];

    }

    /**
     * 贪心算法
     * 局限点：每天都比较买入卖出价格，长度为n的价格表，需要比较交易n-1此
     *
     * @param prices
     * @return
     */
    public int maxProfit2(int[] prices) {
        //寻找相邻两个数之间的利用最大值
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            res += Math.max(0, prices[i] - prices[i - 1]);
        }
        return res;
    }
}

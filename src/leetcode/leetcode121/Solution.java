package leetcode121;

class Solution {
    public int maxProfit(int[] prices) {

        int cost = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            cost = Math.min(cost,prices[i]);
            profit = Math.max(profit,prices[i]-cost);
        }


        return profit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int max = solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println(max);
    }
}
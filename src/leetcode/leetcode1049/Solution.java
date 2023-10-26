package leetcode.leetcode1049;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    //1049最后一块石头的重量
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum = sum + stones[i];
        }
        int capacity = sum/2;
//        if (sum % 2 != 0){
//            capacity = sum/2 + 1;
//        }

        int[] dp = new int[capacity + 1];
        for (int i = 0; i < dp.length; i++) {
//            if (stones[0] <= 1){
//                dp[i] = 1;
//                continue;
//            }
            dp[i] = 0;
        }
        for (int i = 0; i < stones.length; i++) {
            for (int j = capacity; j > 0; j--) {
                if (j >= stones[i]) {
                    dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
                }
            }
        }
        return Math.abs(sum - dp[capacity]*2);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] stones = new int[]{1,2};
        int i = solution.lastStoneWeightII(stones);

        System.out.println(i);
    }
}

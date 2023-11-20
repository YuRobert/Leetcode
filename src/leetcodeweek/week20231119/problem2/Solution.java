package leetcodeweek.week20231119.problem2;

class Solution {
    //超时
//    public long minimumSteps(String s) {
//        long result = 0;
//        for (int i = 0; i < s.length(); i++)
//        {
//            if (s.charAt(i) == '1'){
//                for (int j = i + 1; j < s.length(); j++)
//                {
//                    if (s.charAt(j) == '0'){
//                        result++;
//                    }
//                }
//            }
//        }
//        return result;
//    }

    public long minimumSteps(String s) {
        long[] dp = new long[s.length()];
        long[] nums = new long[s.length()];
        if (s.charAt(0) == '1'){
            nums[0] = 1;
        }
        else{
            nums[0] = 0;
        }
        for (int i = 1; i < dp.length; i++)
        {
            if (s.charAt(i) == '1'){
                nums[i] = nums[i - 1] + 1;
                dp[i] = dp[i - 1];
            }else{
                nums[i] = nums[i - 1];
                dp[i] = dp[i - 1] + nums[i - 1];
            }
        }

        return dp[s.length() - 1];
    }

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        long l = solution.minimumSteps("1100"); //0024 10101  0 1 1 3 3   1 1 2 2 3
        System.out.println(l);
    }
}
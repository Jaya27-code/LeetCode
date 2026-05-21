class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n = nums.size();
        int[][] dp = new int[n + 1][target + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            int num = nums.get(i - 1);
            for (int sum = 0; sum <= target; sum++) {
                dp[i][sum] = dp[i - 1][sum];
                if (sum >= num && dp[i - 1][sum - num] != -1)

                {
                    dp[i][sum] = Math.max(dp[i][sum],  dp[i - 1][sum - num] + 1);
                }
            }
        }
        return dp[n][target];
    }
}
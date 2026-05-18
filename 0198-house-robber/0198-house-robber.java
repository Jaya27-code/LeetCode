
import java.util.Arrays;

class Solution {

    public int rob(int[] nums) {

        int[] dp = new int[nums.length];

        Arrays.fill(dp, -1);

        return loot(nums, 0, dp);
    }

    private int loot(int[] nums, int i, int[] dp) {

        if (i >= nums.length)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int pick = nums[i] + loot(nums, i + 2, dp);

        int skip = loot(nums, i + 1, dp);

        return dp[i] = Math.max(pick, skip);
    }
}
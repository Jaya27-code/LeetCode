class Solution {
    public boolean canPartition(int[] nums) {
        int numsSum=0;
        for(int ele : nums) numsSum += ele;
        if(numsSum%2 == 1) return false;
        int n=nums.length;
       int  target=numsSum/2;
        Boolean [][] dp=new Boolean[n] [target+1];
        return subSet(0,target,nums,dp);
            }
            private static boolean subSet(int i,int target,int[]  nums,Boolean[][] dp)
            {
                if(i==nums.length) return (target==0);
                if(dp[i] [target] != null) return dp[i][target];
                boolean skip=subSet(i+1,target,nums,dp);
                if(target-nums[i]>=0)
                {
                    boolean pick=subSet(i+1,target-nums[i],nums,dp);
                    return dp[i][target]=pick || skip;
                }
                else return dp[i][target]=skip;
            }
}
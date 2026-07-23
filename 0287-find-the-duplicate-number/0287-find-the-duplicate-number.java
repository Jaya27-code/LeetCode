class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        int ans = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(hm.contains(nums[i])){
                ans = nums[i];
                break ;
            }
            else{
                hm.add(nums[i]);
            }
        }
        return ans ;
    }
}
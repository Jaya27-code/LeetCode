class Solution 
{
    public int countCompleteDayPairs(int[] hours) 
    {
        int[] rem=new int[24];
        int count=0;
        for(int h:hours)
        {
            int r=h%24;
            int need=(24-r)%24;
            count += rem[need];
            rem[r]++;
        }
        return count;
    }
}
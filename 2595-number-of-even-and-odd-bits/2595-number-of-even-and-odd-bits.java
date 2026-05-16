class Solution 
{
    public int[] evenOddBit(int n)
     {
        String binary=Integer.toBinaryString(n);
        
        
    ArrayList<Integer> evenList=new ArrayList<>();
    ArrayList<Integer> oddList=new ArrayList<>(); 
    int len=binary.length();
    for(int i=0; i<len; i++)
    {
        int xidx=len-1-i;
        if(binary.charAt(i)=='1')
        {
            if(xidx%2==0) evenList.add(xidx);
            else oddList.add(xidx);
        }
    }
    return new int[]{evenList.size(),oddList.size()};
}
     
}
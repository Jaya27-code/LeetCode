class Solution 
{
    public int countConsistentStrings(String allowed, String[] words) 
    {
        int count = 0;
        for (String word : words)
        {
            boolean consistent = true;
        
        for (int i =0;i<word.length();i++)
        {
            char c=word.charAt(i);
            boolean found=false;

            for (int j=0;j<allowed.length();j++)
            {
                if(c==allowed.charAt(j))
                {
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                consistent=false;
                break;
            }
        }
        if (consistent) count++;
    }
    return count;
}
}
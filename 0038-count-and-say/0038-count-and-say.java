class Solution {
    public String countAndSay(int n) {
        String result = "1";

        for (int i = 2; i <= n; i++) {
            StringBuilder temp = new StringBuilder();
            
            int j = 0;
            while (j < result.length()) {
                int count = 1;
                
                
                while (j + 1 < result.length() && result.charAt(j) == result.charAt(j + 1)) {
                    j++;
                    count++;
                }
                
                temp.append(count).append(result.charAt(j));
                j++;
            }
            
            result = temp.toString();
        }
        
        return result;
    }
}
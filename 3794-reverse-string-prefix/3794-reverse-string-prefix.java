class Solution {
    public String reversePrefix(String s, int k) {
    
        StringBuilder sm = new StringBuilder(s.substring(0 ,k ));
        sm.reverse();
        sm.append(s.substring(k , s.length()));
        return sm.toString();

    }
}
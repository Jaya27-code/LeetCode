import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res=new ArrayList<>();
        String sep= Pattern.quote(String.valueOf(separator));
        for(String w :words){
            for(String part: w.split(sep)){
                if(!part.isEmpty()) res.add(part);
            }
        }
        return res;
    }
}
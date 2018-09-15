import java.util.Arrays;

public class Solution {
    public String sortString(String s){
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public boolean isAnagram(String s, String t) {
        String s_sorted = sortString(s);
        String t_sorted = sortString(t);
        return ((s==t)?true:false);
    }
}

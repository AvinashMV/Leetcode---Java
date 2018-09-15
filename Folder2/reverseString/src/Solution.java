import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {



    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        Pattern pattern =  Pattern.compile("\\w");
        Matcher match = pattern.matcher(s);
        StringBuilder sb = new StringBuilder();
        while(match.find()){
            if(match.group().length()!=0)
                sb.append(match.group());
        }

       /* System.out.println(sb.toString());
        System.out.println(sb.reverse().toString());*/

        if(sb.toString().equals(sb.reverse().toString()))
            return true;
        else
            return false;
    }
}

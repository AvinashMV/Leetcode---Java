import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int strStr(String haystack, String needle) {
        int startIndex = -1;
        if(needle.equals(""))
            return 0;

        Pattern pattern = Pattern.compile(needle);
        Matcher match  = pattern.matcher(haystack);


        while(match.find()){
            startIndex = match.start();
            if(match.group().length()!=0){
                System.out.print(match.group().trim());
            }
            System.out.println();
        }
        /*System.out.println();
        String newstr = match.replaceAll("9");
        System.out.println(newstr);*/
        return startIndex;
    }

}

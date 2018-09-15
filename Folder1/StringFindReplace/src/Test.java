import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
This is a demo program in which we find and replace the pattern in a string.

 */
public class Test {
    public String replace(String regEx, String str){
        Pattern pattern = Pattern.compile(regEx);
        Matcher match = pattern.matcher(str);

        while(match.find()){
            if(match.group()!=null){
                System.out.println(match.group());
            }
        }

        return str.replaceAll(regEx,"Z");
    }
}

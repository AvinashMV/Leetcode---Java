import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Character,Character> myMap;

    public Solution(){
        myMap = new HashMap<>();
    }

    public boolean helper(String s, String t){
        boolean flag = false;
        boolean result;

        for(int i=0;i<s.length();i++){
            if(myMap.containsKey(s.charAt(i))){
                if(myMap.get(s.charAt(i))!=t.charAt(i))
                    flag = true; // not equal. return false
            }else{
                myMap.put(s.charAt(i),t.charAt(i));
            }

            if(flag)
                break;
        }

        result = (flag==true) ? false : true;
        return result;
    }

    public boolean isIsomorphic(String s, String t) {
       return helper(s,t)||helper(t,s);
    }
}

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        if(strs.length==1)
            return strs[0];

        String referenceString = strs[0];
        // System.out.println(referenceString);
        String prefix = "";
        String finalPrefix = "";
        boolean isMatch = true;

        for(int i=0;i<referenceString.length();i++){
            prefix = prefix+referenceString.charAt(i);

            for(String j:strs){
                if(!j.startsWith(prefix)){
                    isMatch = false;
                    break;
                }
            }

            if(isMatch){
                finalPrefix = prefix;

            }else{
                break;
            }
        }
        return finalPrefix;
    }
}

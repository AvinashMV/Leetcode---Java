public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()<1 || s.equals(" "))
            return 0;

        String[] strList = s.split(" ");

        /*for(String i:strList){
            System.out.println(i);
        }*/

        String lastWord = strList[strList.length-1];
        System.out.println(lastWord.length());

        return lastWord.length();
    }
}

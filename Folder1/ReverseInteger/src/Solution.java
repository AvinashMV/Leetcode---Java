/*
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class Solution {
    public int reverse(int x) {
        boolean isNeg = (x<0)?true:false;
        x = Math.abs(x);
        if(x>=Integer.MAX_VALUE)
            return 0;
        long rev = 0;
        while(x>0){
           /* if(x>Integer.MAX_VALUE/10)
                return 0;*/
            rev = rev *10 + x%10;
            x = x/10;
        }
        if(rev>Integer.MAX_VALUE)
            return 0;
        rev = isNeg?rev*-1:rev;
        return (int)rev;
    }
}

/*

2147483647
-2147483647
 */
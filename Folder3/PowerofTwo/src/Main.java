/*
Given an integer, write a function to determine if it is a power of two.

Example 1:

Input: 1
Output: true
Explanation: 20 = 1
Example 2:

Input: 16
Output: true
Explanation: 24 = 16
Example 3:

Input: 218
Output: false
 */

public class Main {

    public static boolean helper(int n){
        if(n<=0)
            return false;
        return ( Integer.bitCount(n)>1 ? false: true );
    }
    public static void main(String[] args) {
        System.out.println(helper(23));
    }
}

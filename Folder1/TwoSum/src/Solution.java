/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [11, 15,2,7], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer,Integer> myMap;

    public Solution(){
        myMap = new HashMap<>();
    }

    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];

        for(int i=0;i<nums.length;i++){
            int difference = target - nums[i];
            if(myMap.containsKey(nums[i])){
                result[0] = i;
                result[1] = myMap.get(nums[i]);
                break;

            }else{
                myMap.put(difference,i);
            }
        }
        Arrays.sort(result);
        return result;
    }

}

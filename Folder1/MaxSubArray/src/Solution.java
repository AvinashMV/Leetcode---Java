public class Solution {
    public int maxSubArray(int[] nums) {

        int maxSoFar = -Integer.MAX_VALUE;
        int currSum = 0;
        for(int i=0;i<nums.length;i++){
            currSum = Math.max(nums[i],nums[i]+currSum);
            maxSoFar = Math.max(currSum,maxSoFar);
        }
        return maxSoFar;
    }
}

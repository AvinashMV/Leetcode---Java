public class Solution {

    public void helper(int[] nums){
        int temp = nums[nums.length-1];
        //move all the elements.
        for(int i=nums.length-2;i>=0;i--){
            nums[i+1] = nums[i];
        }
        nums[0]=temp;
    }

    public void rotate(int[] nums, int k) {

        for(int i=k ;i>=1;i--)
            helper(nums);

        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]);
    }
}

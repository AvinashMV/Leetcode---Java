import java.util.ArrayList;

public class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> myList = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                myList.add(nums[i]);
        }

        int numOfZeros = nums.length - myList.size();

        for(int i=0;i<myList.size();i++){
            nums[i] = myList.get(i);
        }

        for(int i=myList.size();i<nums.length;i++)
            nums[i]=0;
    }
}

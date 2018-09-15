public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums = {11, 15,2,7};
        int target = 9;

        int [] result = solution.twoSum(nums,target);
        for(int i=0;i<result.length;i++)
            System.out.println(result[i]);
    }

}

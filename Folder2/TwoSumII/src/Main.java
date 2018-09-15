public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2,7,11,15};
        arr = solution.twoSum(arr,9);

        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}

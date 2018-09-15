public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr={0,1,0,3,12};
        solution.moveZeroes(arr);

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}

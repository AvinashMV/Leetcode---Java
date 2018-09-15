public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {9,9,9};
        int [] newarr = solution.plusOne(arr);

        for(int i=0;i<newarr.length;i++)
            System.out.print(newarr[i]);
    }
}

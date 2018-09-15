public class Solution {
    public int reverseBits(int n) {
        String bin = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        sb.append(bin);
        String revbin = sb.reverse().toString();
        int newNumber = Integer.parseInt(revbin,2);
        System.out.println(newNumber);
        return -1;

    }
}

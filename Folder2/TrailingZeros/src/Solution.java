public class Solution {
    public int trailingZeroes(int n) {
        long fac = 1;
        for(int i=n;i>0;i--){
            fac *=i;
        }
        System.out.println(fac);
        long zeros = 0, rem;
        while(fac>0){
            rem = fac%10;
            if(rem==0) {
                zeros++;
                fac = fac/10;
            }else{
                break;
            }
        }
        // System.out.println(zeros);
        return (int)zeros;
    }
}

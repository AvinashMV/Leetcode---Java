public class Solution {
    public boolean isHappy(int n) {
        boolean isHappy = false;
        long num = n;

        for(int i=0;i<10;i++){
            long newNum = 0;
            while(num>0){
                newNum += (long)Math.pow(num%10,2);
                num = num/10;
            }
            if(newNum==1) {
                isHappy =true;
                break;
            }
            num = newNum;
        }

        if(isHappy)
            return true;
        else
            return false;
    }
}

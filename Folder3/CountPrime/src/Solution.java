public class Solution {
    public int countPrimes(int n) {
        if(n<3)
            return 0;

        int count = 1;
        boolean flag = true;

        for(int i=3;i<n;i++){
            flag = true;
            if(i%2==0)  // check for even.
                continue;
            else{
                for(int j=3;j<=(int)Math.sqrt(i);j+=2){    // check for odd.
                    if(i%j==0){
                        flag = false; // not a prime number.
                        break;
                    }
                }
                if(flag){
                    count++;
                }
            }

        }
        return count;
    }
}

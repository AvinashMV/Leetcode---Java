import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Set<Integer> mySet = new HashSet<>();
    private Set<Integer> stdSet = new HashSet<>();

    public Solution(){
        stdSet.add(2);
        stdSet.add(3);
        stdSet.add(5);
    }
    public void getFactors(int num){

        while(num%2==0){
            mySet.add(2);
            num = num/2;
        }

        for(int i=3;i<=Math.sqrt(num);i+=2){
            while(num%i==0){
                mySet.add(i);
                num = num/i;
            }
        }

        if(num>2)
            mySet.add(num);
    }

    public boolean isUgly(int num) {
        getFactors(num);
        System.out.println(mySet);

        Set<Integer> difference = new HashSet<>(mySet);
        difference.removeAll(stdSet);
        if(difference.size()>0)
            return false;
        return true;
    }
}

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int missingNumber(int[] nums) {

        List<Integer> myList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> mySet = new HashSet<>(myList);

        int maxValue = myList.size();
        int minValue = 0;

        Set<Integer> mySetAll = new HashSet<>();
        for(int i=minValue;i<=maxValue;i++){
            mySetAll.add(i);
        }

        mySetAll.removeAll(mySet);
        System.out.println(mySetAll);

        Iterator itr = mySetAll.iterator();
        int missingNum = (int) itr.next();

        return missingNum;
    }
}

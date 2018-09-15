import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer,Integer> myMap;

    public Solution(){
        myMap = new HashMap<>();
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] indicies = new int[2];

        for(int i=0;i<numbers.length;i++){
            if(myMap.containsKey(numbers[i])){
                indicies[0]=i+1; // current index
                indicies[1]= myMap.get(numbers[i])+1;
                break;
            }
            myMap.put(target-numbers[i],i);
        }

        Arrays.sort(indicies);
        return indicies;
    }
}

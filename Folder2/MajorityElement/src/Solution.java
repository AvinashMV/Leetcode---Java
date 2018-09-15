import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public int majorityElement(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> myset = new HashSet<>(list);
        int threshold = nums.length/2;

        // System.out.println(list);
        int result = -1;
        // System.out.println(Collections.frequency(list,3));
        for(int i:myset){
            if(Collections.frequency(list,i)>threshold) {
                result = i;
                // System.out.println("element is "+i);
                // System.out.println("Frequency is "+Collections.frequency(list,i));
                break;
            }
        }

        return result;
    }
}

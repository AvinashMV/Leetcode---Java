import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int searchInsert(int[] nums, int target) {

        if(target<nums[0])
            return 0;
        int index = -1;
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if(list.contains(target)){
            return list.indexOf(target);

        }else{ // target is not there and not a first element.
            for(int i=0;i<list.size();i++){
                if(target<list.get(i)) {
                    return i;
                }

            }
        }

        // should be at the end.
        return nums.length;
    }
}

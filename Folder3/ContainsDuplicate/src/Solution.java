import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Set<Integer> set = new HashSet<>(list);

        if(list.size()==set.size())
            return false;
        else
            return true;

    }
}


/*

public boolean containsDuplicate(int[] nums) {
        ArrayList<Integer> myList = new ArrayList<>();
        boolean isDup = false;

        for(int i=0;i<nums.length;i++){
            if(myList.contains(nums[i])){
                isDup = true;
                break;

            }else{
                myList.add(nums[i]);
            }
        }

        return isDup;
    }

 */
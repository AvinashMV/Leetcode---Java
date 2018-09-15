/*
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    List< List<Integer> > mylist = new ArrayList<>();


    public Solution(){
        List<Integer> row1 = Arrays.asList(1);
        List<Integer> row2 = Arrays.asList(1,1);
        mylist.add(row1);
        mylist.add(row2);

    }

    public List<List<Integer>> generate(int numRows) {
        if(numRows<=mylist.size())
            return mylist;

        for(int i=2;mylist.size()<numRows;i++){

            List<Integer> curRow = new ArrayList<>();
            List<Integer> previousRow = mylist.get(i-1);
            curRow.add(previousRow.get(0)); // 1st element of the previous row

            for(int j=0;j<previousRow.size()-1;j++){
                curRow.add(previousRow.get(j)+previousRow.get(j+1));
            }
            curRow.add(previousRow.get(previousRow.size()-1)); // last element of the previous row.
            mylist.add(curRow);

        }
        return mylist;
    }
}

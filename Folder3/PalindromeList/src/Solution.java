import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    private ArrayList<Integer> mylist;

    public Solution(){
        mylist = new ArrayList<>();
    }

    public void extractValues(ListNode p){
        while(p!=null){
            mylist.add(p.val);
            p = p.next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        extractValues(head);
        ArrayList<Integer> mylist2 = new ArrayList<>(mylist);
        Collections.reverse(mylist2);
        if(mylist.equals(mylist2))
            return true;
        else
            return false;
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    ListNode head = null;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1 = extractValues(l1);
        int  l2 = extractValues(l2);
        int requiredNumber = l1+l2;


        while(requiredNumber >0 ){
            int lastDigit = requiredNumber % 10;
            appendNode(lastDigit);
            requiredNumber = requiredNumber/10;
        }
        return head;
    }

    public int extractValues(ListNode p){
        ArrayList<Integer> mylist = new ArrayList<>();
        int number = 0;
        while(p!=null){
            mylist.add(p.val);
            p=p.next;
        }
        Collections.reverse(mylist);
        //system.out.println(mylist);

        for(Integer i:mylist){
            number = number*10+i;
        }
        return number;
    }

    public void appendNode(int num){
        ListNode node  = new ListNode(num);
        node.next = null;

        if(head==null) {
            head = node;
            return;
        }

        ListNode p = head;
        while(p!=null){
            p=p.next;
        }
        p.next = node;

    }
}

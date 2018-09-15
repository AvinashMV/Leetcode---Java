/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy, p1 = l1, p2 = l2;

        while(p1!=null || p2!=null){
            if(p1!=null && p2!=null) {
                if (p1.val == p2.val) {
                    p = appendNode(p, p1.val);
                    p = appendNode(p, p2.val);
                    p1 = p1.next;
                    p2 = p2.next;

                } else if (p1.val < p2.val) {
                    p = appendNode(p, p1.val);
                    p1 = p1.next;


                } else if (p2.val < p1.val) {
                    p = appendNode(p, p2.val);
                    p2 = p2.next;

                }
            }else if(p1==null){  // p2 is null
                p = appendNode(p, p2.val);
                p2 = p2.next;

            }else if(p2==null){  // p1 is null
                p = appendNode(p,p1.val);
                p1 = p1.next;
            }
        }
        return dummy.next;
    }

    public ListNode appendNode(ListNode p, int number){
        ListNode temp = new ListNode(number);
        p.next = temp;
        p = p.next;
        return p;
    }
}

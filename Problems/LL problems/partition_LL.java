/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(-1);
        ListNode bigDummy = new ListNode(-1);
        ListNode curr=head;

        ListNode smallTail = smallDummy;
        ListNode bigTail = bigDummy;
        while(curr!=null)
        {
            if(curr.val<x)
            {
                smallTail.next=curr;
                smallTail=smallTail.next;
            }
            else
            {
                bigTail.next=curr;
                bigTail=bigTail.next;
            }
            curr=curr.next;
        }
        smallTail.next=bigDummy.next;
        bigTail.next=null;

    }
}
//solve it at your own
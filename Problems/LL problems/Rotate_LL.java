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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Find the length and tail node
        ListNode tail = head;
        int size = 1;
        while (tail.next != null) {
            size += 1;
            tail = tail.next;
        }

        // Step 2: Modulo for large k
        k = k % size;
        if (k == 0) return head;

        // Step 3: Connect tail to head to make it circular
        tail.next = head;

        // Step 4: Find new tail (size - k steps from head)
        int stepsToNewTail = size - k;
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        // Step 5: Set new head and break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}


//no code for this solve it on your own, becaus it's time to go to the 2nd month phase.

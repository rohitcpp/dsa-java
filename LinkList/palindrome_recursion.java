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
    private ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return helper(head);
    }

    private boolean helper(ListNode right) {
        if (right == null) return true;
        boolean isPal = helper(right.next) && (left.val == right.val);
        left = left.next;
        return isPal;
    }
}


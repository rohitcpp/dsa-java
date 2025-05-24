class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // If list is empty or k is 1, no reversal needed
        if (head == null || k == 1) return head;

        // Check if there are at least k nodes
        ListNode current = head;
        int count = 0;
        while (current != null && count < k) {
            current = current.next;
            count++;
        }
        
        // If not enough nodes, return list as is
        if (count < k) return head;

        // Reverse k nodes
        ListNode previous = null;
        current = head;
        for (int i = 0; i < k; i++) {
            // Store next node
            ListNode nextNode = current.next;
            // Reverse link
            current.next = previous;
            // Move pointers
            previous = current;
            current = nextNode;
        }

        // Connect reversed group to the next part
        head.next = reverseKGroup(current, k);

        // Return new head of reversed group
        return previous;
    }
}
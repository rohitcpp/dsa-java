class Solution {
    private ListNode left;

    public void reorderList(ListNode head) {
        left = head;
        reorderHelper(head);
    }

    private boolean reorderHelper(ListNode right) {
        if (right == null) return true;

        boolean continueReordering = reorderHelper(right.next);
        if (!continueReordering) return false;

        // Stop condition: when left meets or crosses right
        if (left == right || left.next == right) {
            right.next = null;
            return false; // Stop further processing
        }

        // Reorder links
        ListNode nextLeft = left.next;
        left.next = right;
        right.next = nextLeft;

        // Move left forward
        left = nextLeft;

        return true;
    }
}

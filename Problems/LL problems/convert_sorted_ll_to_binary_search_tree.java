class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null; // Base Case 1: empty list → return null

        // Base Case 2: Only one node → this becomes a TreeNode (leaf)
        if (head.next == null) return new TreeNode(head.val);

        // Step 1: Find the middle node (will become root of subtree)
        ListNode mid = getMiddle(head);

        // Step 2: Create the root node of this subtree
        TreeNode root = new TreeNode(mid.val);

        // Step 3: Recursively construct left and right subtrees
        root.left = sortedListToBST(head);            // Left side of mid
        root.right = sortedListToBST(mid.next);       // Right side of mid

        return root;
    }

    private ListNode getMiddle(ListNode head) {
        // Use slow and fast pointers to find middle
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;         // track node before mid
            slow = slow.next;    // move slow by 1
            fast = fast.next.next; // move fast by 2
        }

        // Disconnect left half from mid
        if (prev != null) {
            prev.next = null;
        }

        return slow;  // middle node
    }
}

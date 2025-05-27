class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addRecursive(l1, l2, 0);
    }

    private ListNode addRecursive(ListNode l1, ListNode l2, int carry) {
        // Base case: if all are null and no carry
        if (l1 == null && l2 == null && carry == 0) return null;

        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;

        int sum = val1 + val2 + carry;
        int newVal = sum % 10;
        int newCarry = sum / 10;

        ListNode newNode = new ListNode(newVal);
        newNode.next = addRecursive(
            (l1 != null) ? l1.next : null,
            (l2 != null) ? l2.next : null,
            newCarry
        );

        return newNode;
    }
}

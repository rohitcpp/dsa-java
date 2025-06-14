public ListNode swapPairs(ListNode head) {
    // Create a dummy node
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    
    ListNode prev = dummy;
    
    while (prev.next != null && prev.next.next != null) {
        ListNode first = prev.next;
        ListNode second = first.next;
        
        // Swapping
        prev.next = second;
        first.next = second.next;
        second.next = first;
        
        // Move prev 2 steps forward
        prev = first;
    }
    
    return dummy.next;
}

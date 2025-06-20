import org.w3c.dom.Node;

public class copy_list_with_random_pointer {
    class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // 🔁 Step 1: Insert cloned nodes after each original node
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // 🔁 Step 2: Set random pointers for the cloned nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                // curr.next is the cloned node
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next; // move to the next original node
        }

        // 🔁 Step 3: Detach original list and the cloned list
        curr = head;
        Node dummyHead = new Node(0);
        Node cloneCurr = dummyHead;

        while (curr != null) {
            // Extract the clone
            Node clone = curr.next;
            cloneCurr.next = clone;
            cloneCurr = clone;

            // Restore the original list
            curr.next = clone.next;
            curr = curr.next;
        }

        return dummyHead.next;
    }
}

}

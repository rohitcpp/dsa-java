import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class priorityqueue_ll {
    public ListNode mergeKLists(ListNode[] lists) {
        // Min-Heap that stores nodes by their value
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        // Step 1: Add the head of each list into the heap
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        // Dummy node to start the merged list
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Step 2: Extract the min node, and add its next into heap
        while (!minHeap.isEmpty()) {
            ListNode minNode = minHeap.poll(); // smallest node
            tail.next = minNode;               // link it to result
            tail = tail.next;                  // move the tail

            if (minNode.next != null) {
                minHeap.offer(minNode.next);   // push next of popped node
            }
        }

        return dummy.next;
    }
}

/*
 Question :
  1->4->5,
  1->3->4,
  2->6
 */
//output: 1->1->2->3->4->4->5->6
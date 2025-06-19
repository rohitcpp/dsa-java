public class populating_next_right_pointers_in_each_node_2 {
    class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Node current = root; // current node at current level

        while (current != null) {
            Node dummy = new Node(0); // dummy head for next level
            Node tail = dummy;

            while (current != null) {
                if (current.left != null) {
                    tail.next = current.left;
                    tail = tail.next;
                }
                if (current.right != null) {
                    tail.next = current.right;
                    tail = tail.next;
                }
                current = current.next; // move within the level
            }

            current = dummy.next; // move to the next level
        }

        return root;
    }
}

}

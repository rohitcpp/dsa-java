public class populating_next_right_pointers_in_each_node(){
public Node connect(Node node) {
    if (node == null || node.left == null) return;

    // 1. Connect left → right
    node.left.next = node.right;

    // 2. Connect right → neighbor's left
    if (node.next != null)
        node.right.next = node.next.left;

    // 3. Recur for children
    connect(node.left);
    connect(node.right);
}
}
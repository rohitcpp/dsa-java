class Node {
    int val;
    Node left, right, next;

    Node(int val) {
        this.val = val;
    }
}

public class dummy_DFS_traversal {

    public static void main(String[] args) {
        // Build the perfect binary tree:
        //         1
        //       /   \
        //     2       3
        //   /  \     /  \
        //  4    5   6    7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Run the connect method with tracing
        connect(root);
    }

    public static void connect(Node node) {
        if (node == null || node.left == null) {
            return;
        }

        System.out.println("Connecting Node: " + node.val);
        System.out.println("  --> Left: " + node.left.val + ", Right: " + node.right.val);

        // 1. Connect left → right
        node.left.next = node.right;
        System.out.println("  => " + node.left.val + ".next -> " + node.right.val);

        // 2. Connect right → neighbor’s left (if exists)
        if (node.next != null) {
            node.right.next = node.next.left;
            System.out.println("  => " + node.right.val + ".next -> " + node.next.left.val);
        }

        // Recur down left and right subtrees
        connect(node.left);
        connect(node.right);
    }
}

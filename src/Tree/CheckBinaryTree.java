package Tree;

class Nodes {
    int data;
    Nodes left, right;

    // Constructor
    Nodes(int data) {
        this.data = data;
        left = right = null;
    }
}

public class CheckBinaryTree {
    public static void main(String[] args) {
        // Create root node
        Nodes root = new Nodes(1);

        // Left subtree
        root.left = new Nodes(2);
        root.right = new Nodes(3);

        // Adding more children
        root.left.left = new Nodes(4);
        root.left.right = new Nodes(5);
        root.right.right = new Nodes(6);

        if (isBalanced(root)) {
            System.out.println("Tree is balanced");
        } else {
            System.out.println("Tree is NOT balanced");
        }
    }

    // Returns height if balanced, -1 if not
    public static int checkHeight(Nodes root) {
        if (root == null) return 0;

        int left = checkHeight(root.left);
        if (left == -1) return -1; // not balanced

        int right = checkHeight(root.right);
        if (right == -1) return -1; // not balanced

        if (Math.abs(left - right) > 1) return -1; // imbalance found

        return Math.max(left, right) + 1; // return height
    }

    public static boolean isBalanced(Nodes root) {
        return checkHeight(root) != -1;
    }
}

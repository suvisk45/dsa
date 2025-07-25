package TreeTraversal;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
    }
}

public class Diameter {
    int maxs=0;
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Diameter d = new Diameter();
        Node root = new Node(5);

        root.left = new Node(3);
        root.right = new Node(8);

        root.right.left = new Node(6);
        root.right.left.right = new Node(7);

        root.right.right = new Node(9);
        d.diameter(root);
    }
    public int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int left = diameter(root.left);
        System.out.println("left :"+left);
        int right = diameter(root.right);
        System.out.println("right :"+right);
        maxs=Math.max(maxs,left+right+1);
        System.out.println("diameter :"+maxs +"  data :"+root.data);
        return Math.max(left, right) + 1;
    }
}

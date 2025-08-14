package Bactracking;

// Node class for the binary tree
class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    int maxs = 0;
    static int left=0;
    static int right=0;

    int diameter(Node root) {
        System.out.println("Starting diameter calculation...");
       int a= dia(root);
        System.out.println("Final max diameter: " + a);
        return maxs;
    }

    public int dia(Node root) {
        if(root == null) return 0;
        left+=dia(root.left);
        right+=dia(root.right);
       return root.val+Math.max(left,right);

    }

    public static void main(String[] args) {
        // Constructing this tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        System.out.println(args);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Solution sol = new Solution();
        int diameter = sol.diameter(root);

        System.out.println("Diameter of the tree is: " + diameter);
    }
}

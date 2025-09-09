package Tree;

import java.util.ArrayList;
import java.util.List;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
    }
}

public class pathSum2 {
    public static void main(String[] args) {
        int target = 22;
        List<List<Integer>> list = new ArrayList<>();

        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);

        root.left.left = new Node(11);

        root.right.left = new Node(13);
        root.right.right = new Node(4);

        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);

        root.right.right.left = new Node(5);
        root.right.right.right = new Node(1);

        dfs(root, target, new ArrayList<>(), list);
        System.out.println(list);
    }

    public static void dfs(Node root, int target, ArrayList<Integer> s, List<List<Integer>> list) {
        if (root == null) return;

        s.add(root.data);
        target -= root.data;

        if (root.left == null && root.right == null && target == 0) {
            list.add(new ArrayList<>(s));
        } else {
            dfs(root.left, target, s, list);
            dfs(root.right, target, s, list);
        }

        s.remove(s.size() - 1);
    }
}

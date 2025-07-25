import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class recursion {
    ArrayList<Integer> rightSide = new ArrayList();

    private void traverse(TreeNode node, int level) {
        if (level == rightSide.size()) {
            System.out.println(level);
            System.out.println(node.val);
            rightSide.add(node.val);
            System.out.println(rightSide);
        }
        System.out.println("summa +"+node.val);
        if (node.right != null) {
            System.out.println("right side :");
            traverse(node.right, level + 1);
        }

        if (node.left != null) {
            System.out.println("left side :");
            traverse(node.left, level + 1);
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return rightSide;
        }

        traverse(root, 0);
        return rightSide;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);
        recursion rc=new recursion();
        List<Integer> str=rc.rightSideView(root);
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}



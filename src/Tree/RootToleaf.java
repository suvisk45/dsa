package Tree;

import java.util.ArrayList;
import java.util.Scanner;


public class RootToleaf {

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        ArrayList<Integer> s=new ArrayList<>();
        rootToLeaf(result,root,s);
        System.out.println(result);
    }

    private static void rootToLeaf(ArrayList<ArrayList<Integer>> result, TreeNode root, ArrayList<Integer> s) {
        if(root.left==null && root.right==null) {
            s.add(root.val);
            System.out.println(s);
            result.add(new ArrayList<>(s));
            System.out.println(result);
            s.remove(s.size()-1);
            return;
        }
        s.add(root.val);
        rootToLeaf(result,root.left,s);
        rootToLeaf(result,root.right,s);
        s.remove(s.size()-1);
    }
}
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

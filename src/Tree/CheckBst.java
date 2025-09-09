package Tree;

import java.util.ArrayList;
import java.util.Collections;

public class CheckBst {
}


 class DummyTree {
    public static void main(String[] args)
    {
        ArrayList<Integer> result=new ArrayList<Integer>();

        // Creating a dummy tree
        /*
                  1
                 / \
                2   3
               / \
              4   5
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        inorder(root,result);
        ArrayList<Integer> str=new ArrayList<>();
        str.addAll(result);
         Collections.sort(result);
        result.forEach(System.out::println);
    }

    // Inorder Traversal (Left -> Root -> Right)
    static void inorder(Node root,ArrayList<Integer> result) {
        if (root == null) return;
        inorder(root.left,result);
        result.add(root.data);
        inorder(root.right,result);
    }
}

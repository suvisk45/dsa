import java.util.*;

public class zigzagTree {
    public static void main(String[] args) {
        TreeNodes leftLeaf = new TreeNodes(4);
        TreeNodes rightLeaf = new TreeNodes(5);

        TreeNodes leftChild = new TreeNodes(2);
        leftChild.left = leftLeaf;

        TreeNodes rightChild = new TreeNodes(3);
        rightChild.right = rightLeaf;

        TreeNodes rootNode = new TreeNodes(1);
        rootNode.left = leftChild;
        rootNode.right = rightChild;
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

          List<List<Integer>> s=   zigzag(rootNode);
          System.out.println(result.size());

    }

    private static  List<List<Integer>> zigzag(TreeNodes root) {
        if(root==null) return new ArrayList<>();

        int level=1;
        Deque<TreeNodes> q = new ArrayDeque<>();
        q.add(root);
        List<List<Integer>> result=new ArrayList<>();
        while(!q.isEmpty())
        {

            System.out.println("queue +"+q);
            int s=q.size();
            if(level%2==0)
            {
                List<Integer> str=new ArrayList<>();
                for(int i=s;i>0;i--)
                {

                    TreeNodes n=q.poll();
                    System.out.println(n);
                    if(n.left!=null) {
                        q.add(n.left);
                    }
                    if(n.right!=null)
                    {
                        q.add(n.right);
                    }
                    str.add(n.val);
                    System.out.println("qqqqq"+q);
                }
                System.out.println("second queue+"+q);
                result.add(str);
                System.out.println(result);
            }
            if(level%2==1)
            {
                List<Integer> str=new ArrayList<>();
                for(int i=0;i<s;i++)
                {

                    TreeNodes n=q.poll();
                    str.add(n.val);
                    System.out.println(n.toString());

                    if(n.right!=null) q.add(n.right);
                    if(n.left!=null) q.add(n.left);

                }
                result.add(str);
                System.out.println(result);
            }
            level++;
        }
        return result;
    }

}
class TreeNodes {
    int val;
    TreeNodes left, right;

    TreeNodes(int val) {
        this.val = val;
    }
    @Override
    public String toString() {
        return ""+val;
    }
}


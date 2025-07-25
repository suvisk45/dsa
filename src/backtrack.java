import org.w3c.dom.Node;

import java.util.ArrayList;

public class backtrack{
    public static void main(String[] args)
    {
         int[] arr={1,2,3,4,5};
         ArrayList<ArrayList<Integer>> result=new ArrayList<>();
         for(int i=0;i<arr.length;i++)
         {
             ArrayList<Integer> s=new ArrayList<>();
             for(int j=0;j<i;j++)
             {
                 s.add(arr[j]);
             }
             result.add(s);
         }
         System.out.println(result);
    }
}
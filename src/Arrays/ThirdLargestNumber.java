package Arrays;


import java.util.*;

//leetcode 414
public class ThirdLargestNumber {

    public static void main(String[] args)
    {
        int[] arr={1,2};
       TreeSet<Integer> str=new TreeSet<>(Collections.reverseOrder());
       for(int i=0;i<arr.length;i++)
       {
           str.add(arr[i]);
       }
        HashSet<Integer> set=new LinkedHashSet<>(str);
           int count=0;
           for (int i : set) {
               if(str.size()<3)
               {
                   System.out.println(i);
                   break;
               }
               if(count==2)
               {
                   System.out.println(i);
                   break;
               }
               count++;
           }
           System.out.println(set);

    }
}

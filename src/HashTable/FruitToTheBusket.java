package HashTable;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FruitToTheBusket {

    public static void main(String[] args)
    {
        int[] f={3,3,3,1,2,1,1,2,3,3,4};
        HashMap<Integer,Integer> str=new LinkedHashMap<>();
       int left=0;
       int count=0;
       for(int right=0;right<f.length;right++)
       {
           str.put(f[right],str.getOrDefault(f[right],0)+1);

           if(str.size()>2)
           {
               System.out.println("left remove "+f[left]);
               while(str.size()>2)
               {
                   System.out.println(f[left]);
                   str.put(f[left],str.get(f[left])-1);
                   if(str.get(f[left])==0) str.remove(f[left]);
                   left++;
               }
           }
           count=Math.max(count,right-left+1);
       }
       System.out.println(count);
    }
}

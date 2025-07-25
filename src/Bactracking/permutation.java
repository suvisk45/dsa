package Bactracking;

import java.util.ArrayList;
import java.util.List;

public class permutation {
    public static void main(String[] args)
    {
        int[] a={1,2,3,4};
        List<List<Integer>> str=new ArrayList<>();
        permute(str,0,a);
        System.out.println(str);
    }

    private static void permute(List<List<Integer>> str, int i, int[] a) {
        if(i==a.length-1)
        {
            List<Integer> s=new ArrayList<>();
            for(int n:a)
            {
                s.add(n);
            }
            str.add(s);
            return;
        }
        for(int j=i;j<a.length;i++)
        {
            swaps(a,i,i+1);
            permute(str,i+1,a);
            swaps(a,i,i+1);
        }
    }

    private static void swaps(int[] a, int i, int i1) {
    }
}

package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(-1));
        triangle.add(Arrays.asList(2, 3));
        triangle.add(Arrays.asList(1, -1, -3));


        int row=triangle.size()-1;
        int mins=Integer.MAX_VALUE;
        int dp[]=new int[row+1];
        dp[0]=triangle.get(0).get(0);
        for(int i:triangle.get(1))
        {
            mins=Math.min(mins,i);
        }
        dp[1]=mins;
        System.out.println(dp[1]);
        for(int i=2;i<=row;i++)
        {
            mins=Integer.MAX_VALUE;
            for(int j:triangle.get(i))
            {
                mins=Math.min(mins,j);
            }
            System.out.println(mins);
            dp[i]=Math.min(mins,dp[i]);
            System.out.println(dp[i]);

        }
        System.out.println(dp[row]);
    }
}

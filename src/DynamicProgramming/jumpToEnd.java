package DynamicProgramming;

import java.util.Arrays;

public class jumpToEnd {

    public static void main(String[] args)
    {
        int[] nums={2, 3, 1, 1, 4};
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums[i];j++)
            {
               dp[i]=Math.max(dp[i],nums[j]);
            }
        }
    }
}

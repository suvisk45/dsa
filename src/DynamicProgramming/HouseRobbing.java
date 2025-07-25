package DynamicProgramming;

public class HouseRobbing {


    public static void main(String[] args)
    {
        int[] house={1, 2, 3, 1};
        int dp[]=new int[house.length];
        dp[0]=house[0];
        dp[1]=house[1];
        int maxs=Integer.MIN_VALUE;
        for(int i=2;i<house.length;i++)
        {
            dp[i]+=house[i]+dp[i-2];
        }
        for(int num:dp)
        {
            maxs=Math.max(maxs,num);
        }
        System.out.println(maxs);
    }
}

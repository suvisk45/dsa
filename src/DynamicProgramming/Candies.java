package DynamicProgramming;

public class Candies {
    public static void main(String[] args)
    {
       int[] candies = {5, 1, 2, 10, 6};
       int dp[]=new int[candies.length];
       dp[0]=candies[0];
       dp[1]=Math.max(candies[0],candies[1]);
       for(int i=2;i<candies.length;i++)
       {
           dp[i]=Math.max(dp[i-1],dp[i-2]+candies[i]);
       }
       System.out.println(dp[candies.length-1]);

    }
}

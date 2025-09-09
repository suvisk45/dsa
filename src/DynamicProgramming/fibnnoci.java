package DynamicProgramming;

public class fibnnoci {
public static void main(String[] args) {
    int i = 4;
    int[] dp = new int[i+2];
    dp[0] = 0;// smaller sub problem to use this in the larger subporblem bottom up approach
    dp[1] = 1;
    for (int j=2;j<=i;j++)
    {
        dp[j]=dp[j-1]+dp[j-2];
    }
    for (int j : dp) {
        System.out.println(j);
    }
}
}

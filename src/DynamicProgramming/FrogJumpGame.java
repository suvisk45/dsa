package DynamicProgramming;

public class FrogJumpGame {


    public static void main(String[] args)
    {
        int[] arr={20,30,40,20};
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        int n=arr.length;
        if(n>1)
        {
            dp[1]=Math.abs(arr[1]-arr[0]);
        }
        for(int i=2;i<arr.length;i++)
        {
            int o=(dp[i-1]+Math.abs(arr[i]-arr[i-1]));
            int b=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
            dp[i]=Math.min(o,b);
        }
        System.out.println(dp[n-1]);

    }

}

package DynamicProgramming;

public class MinimumEnergyPath {

    public static void main(String[] args)
    {
        int[] energy = {10, 20, 30, 5};
        int[] dp=new int[energy.length];
        dp[0]=10;
        for(int i=1;i<energy.length-1;i++)
        {
            dp[i]=dp[i-1]+Math.min(energy[i],energy[i+1]);
        }
        for(int n:dp)
        {
            System.out.println(n);
        }
    }
}

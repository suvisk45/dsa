package DynamicProgramming;

public class MinimumPathSum {


    public static void main(String[] args)
    {

       int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
       int[][] dp=new int[grid.length][grid[0].length];
       int row=grid.length;
       int col=grid[0].length;
       dp[0][0]=grid[0][0];
       for(int i=0;i<grid.length;i++)
       {
           for(int j=0;j<grid[0].length;j++)
           {
            if(i==0 && j>0) dp[i][j]=grid[i][j]+dp[i][j-1];
            else if(j==0 && i>0) dp[i][j]=grid[i][j]+dp[i-1][j];
            if(i>0 && j>0) dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
           }
       }
       System.out.println(dp[row-1][col-1]);
    }
}

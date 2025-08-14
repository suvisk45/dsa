package Bactracking;

import java.util.Scanner;

public class CountCoin {


    public static void main(String args[])
    {
        int[][] arr = {
                {2, 1, 4, 5, 4},
                {1, 3, 3, 3, 4},
                {3, 4, 2, 2, 3},
                {4, 5, 3, 3, 2},
                {3, 5, 5, 5, 1}
        };

        long[] count=new long[1];
        boolean[][] visited=new boolean[arr.length][arr[0].length];
        int sum=arr[0][0];
        dfs(arr.length,20,arr,count,0,0,visited,sum);
        System.out.println(count[0]);
    }
    public static void dfs(int n,int k,int[][] arr,long[] count,int x,int y,boolean[][] visited,int sum)
    {
        if(x==arr.length-1 && y==arr[0].length-1 && sum==k)
        {
            count[0]++;
            System.out.println( "count"+count[0]);
            return;
        }
        if(x<0 || x>=arr.length || y<0 || y>=arr[0].length || visited[x][y]) return;

        visited[x][y]=true;
        System.out.print(arr[x][y] +" ");
        System.out.println("Sum"+sum);
        dfs(n,k,arr,count,x+1,y,visited,sum+arr[x][y]);
        dfs(n,k,arr,count,x,y+1,visited,sum+arr[x][y]);
        visited[x][y]=false;
    }
}


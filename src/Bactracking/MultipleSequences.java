package Bactracking;


import java.util.Scanner;

public class MultipleSequences {
    public static void main(String args[])
    {
        int i=0,j=0;
        int n=10;
        int[][] arr=new int[n][n];
        backtrack(i,j,n,arr,true);
    }
    public static void backtrack(int i,int j,int n,int[][] arr,boolean up)
    {
        for(int  k=i;k<n;k++)
        {
            arr[k][j]=0;

        }
    }
}

package Bactracking;

public class CountIsland {
    private static int count=0;
    public static void main(String[] args)
    {

        char[][] arr=
                {{'L', 'L', 'W', 'W', 'W'},
                 {'W', 'L', 'W', 'W', 'L'},
                 {'L', 'W', 'W', 'L', 'L'},
                  {'W', 'W', 'W', 'W', 'W'},
                  {'L', 'W', 'L', 'L', 'W'}};
        boolean[][] visited=new boolean[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(visited[i][j]==false && arr[i][j]=='L')
                {
                    backtrack(arr,visited,i,j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    public static void backtrack(char[][] arr,boolean[][] visited,int X,int Y)
    {

        if (X < 0 || Y < 0 || X >= arr.length || Y >= arr[0].length || arr[X][Y] == 'W' || visited[X][Y])
        {
            return;
        }
        visited[X][Y]=true;
        backtrack(arr,visited, X+1,Y );
        backtrack(arr,visited,X,Y+1);
        backtrack(arr,visited,X,Y-1);
        backtrack(arr,visited,X-1,Y);
        backtrack(arr,visited,X+1,Y-1);
        backtrack(arr,visited,X+1,Y+1);
    }
}

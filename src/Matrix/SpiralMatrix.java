package Matrix;

import java.util.ArrayList;

public class SpiralMatrix
{
    public static void main(String[] args)
    {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        ArrayList<Integer> str=new ArrayList<Integer>();
        int r=0,c=0,row=mat.length,col=mat[0].length;
        for(c=c;c<col;c++)
        {
           str.add(mat[r][c]);
        }
        for(r=r+1;r<row;r++)
        {
            str.add(mat[r][c-1]);
        }
        for(c=c-1;c>=0;c--)
        {
            str.add(mat[r-1][c]);
        }
        System.out.println(str);
    }
}

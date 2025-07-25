package Matrix;

public class SetMatrixZero {


    public static void main(String[] args)
    {

        int[][] matrix = {{1,0}};
        boolean frz=false;
        boolean fcz=false;
        for(int i=0;i<matrix[0].length;i++)
        {
            if(matrix[0][i]==0) frz=true;
        }
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]==0) fcz=true;
        }

        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
       for(int i=1;i<matrix.length;i++)
       {
           for(int j=1;j<matrix[0].length;j++)
           {
               if(matrix[i][0]==0)
               {
                   matrix[i][j]=0;
               }
               if(matrix[0][j]==0)
               {
                   matrix[i][j]=0;
               }
           }
       }
       if(frz) {
          for(int i=0;i<matrix[0].length;i++)
          {
              matrix[0][i]=0;
           }
       }
       if(fcz) {
         for(int i=0;i<matrix.length;i++)
         {
             matrix[i][0]=0;
           }
       }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}

package Arrays;

public class productArray {

    public static void main(String[] args)
    {
        int[] arr={10, 3, 5, 6, 2};
        int[] larr=new int[arr.length];
        int[] rarr=new int[arr.length];
        int[] result=new int[arr.length];
        int lpre=1;
        int rpre=1;
        for(int i=0;i<arr.length;i++)
        {
            lpre*=arr[i];
            larr[i]=lpre;
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            rpre*=arr[i];
            rarr[i]=rpre;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(rarr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(larr[i]+" ");
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i==0) result[i]=rarr[i+1];
           else if(i==arr.length-1) result[i]=larr[i-1];
            else result[i]=larr[i-1]*rarr[i+1];
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}

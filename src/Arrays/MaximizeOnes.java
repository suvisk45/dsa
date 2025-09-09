package Arrays;

import java.util.HashMap;

public class MaximizeOnes {
    public static void main(String[] args)
    {
        int[] arr = {1, 0, 0, 1, 0, 1, 0, 1};
        int start=0;
        int end=0;
        int count=0;
        int max_count=Integer.MIN_VALUE;
        int zeroFlipped=0;
        int k=2;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1) count++;
            else if(arr[i]==0)
            {
                zeroFlipped++;
                count++;
            }
            if(zeroFlipped>k)
            {
                while(zeroFlipped>k)
                {
                    if(arr[start]==0) zeroFlipped--;
                    start++;
                }
            }
            max_count=Math.max(max_count,i-start+1);
        }
        System.out.println(max_count);
    }
}


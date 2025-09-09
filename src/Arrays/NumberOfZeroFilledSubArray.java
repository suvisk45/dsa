package Arrays;

public class NumberOfZeroFilledSubArray
{

    public static void main(String[] args)
    {
       int[] nums = {1, 3, 0, 0, 2, 0, 0, 4};

       int count=0;
       int result=0;
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]==0)
           {
                int j=i;
                while(j<nums.length && nums[j]==0)
                {
                     count++;
                     j++;
                }
                i=j-1;
               result+=count*(count+1)/2;
               System.out.println(count);
               count=0;
           }
       }
         System.out.println(result);
    }
}

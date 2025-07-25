package DynamicProgramming;

public class MaximumBoxes {

    public static void main(String[] args)
    {
        int[] boxes = {2, 1, 4, 9};
        int dp[]=new int[boxes.length]; // no two adjascent boxes
        dp[0]=boxes[0];
        dp[1]=Math.max(boxes[0],boxes[1]);
        for(int i=2;i<boxes.length;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-2]+boxes[i]);
        }
        System.out.println(dp[boxes.length-1]); // sucessfully
    }
}

package Arrays;

public class CountHillAndValley {

    public static void main(String[] args) {

        int[] nums = {6, 6, 5, 5, 4, 1};
        int count = 0;
        int l = 0;
        int r = 0;
        for (int i = 1; i < nums.length - 1; i++) {
           int p=i-1;
           int n=i+1;
           while(p>0 && nums[i]==nums[p]) p--;
           while(n<nums.length && nums[r]==nums[i]) n++;
           if(nums[i]>nums[p] && nums[i]>nums[n] || nums[i]<nums[p] && nums[i]<nums[n]) count++;
        }
        System.out.println(count);
    }
}

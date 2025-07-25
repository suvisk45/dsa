package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircularArray {

    public static void main(String[] args) {
        int[] nums={5,-3,5};


        int total=0;
        int cmax=0;
        int mins=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            cmax=Math.min(cmax+nums[i],nums[i]);
            mins=Math.min(mins,cmax);
        }
        System.out.println(total);
        System.out.println(mins);
    }
}

package Arrays;

import java.util.*;

public class KdivisibleElement {

    public static void main(String[] args) {


        String str="abc";
        int[] seen=new int[26];
        Arrays.fill(seen,-1);
        int total=0;
        for(int i=0;i<str.length();i++)
        {
            int ch=str.charAt(i)-'a';
            int current=i-seen[ch];
            int prev = seen[ch];
            total += (long)(i - prev) * (str.length() - i);
            seen[ch]=i;
        }
        System.out.println(total);
    }
}

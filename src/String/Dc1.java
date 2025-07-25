package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Dc1 {

    public static void main(String[] args) {

        String s1="lavanya";
        String s2="bhuvana";
        List<Integer> visited=new ArrayList<>();
        HashSet<Integer>  visitedSet=new HashSet<>();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<s2.length();j++)
            {

                if(s1.charAt(i)==s2.charAt(j) && i!=j && !visited.contains(j) && !visitedSet.contains(i))
                {
                    System.out.println(" else if");
                    System.out.println(s1.charAt(i)+"+"+s2.charAt(j)+"+"+i+"+"+ j);
                    count=count+1;
                    visited.add(j);
                    visitedSet.add(i);
                    System.out.println(count);
                }
                else if(s1.charAt(i)==s2.charAt(j) && i==j)
                {
                    System.out.println(" equal" );
                    System.out.println(s1.charAt(i)+"+"+s2.charAt(j));
                    System.out.println(i+"+"+j);
                    visited.add(j);
                    count=count+1;
                }
            }
        }
        System.out.println(count);


    }
}

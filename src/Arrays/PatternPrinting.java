package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class PatternPrinting {


    public static void main(String[] args)
    {
        int n=3;
        LinkedList<Integer> str=new LinkedList<>();
        for(int i=n;i>=1;i--)
        {

            int count=1;
            for(int j=n*i, k=n;j>=1 && k>=1;j--)
            {
                if(k!=0) str.add(k);
                if(count%i==0)
                {
                    k=k-1;

                }

                count++;
            }
            str.add(-1);
        }
        str.forEach(System.out::print);
    }

}

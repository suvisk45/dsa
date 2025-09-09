package String;

import java.util.ArrayList;

public class ReverseEvery2kChar
{
    public static void main(String[] args)
    {
        String str="abcd";
        StringBuilder s=new StringBuilder();
        s.append(str);
        int k=2;
        ArrayList<String> list=new ArrayList<String>();
        int i=0;
        for( i=0;i<str.length()-k;i+=k)
        {
           String a= s.substring(i,k+i);
           list.add(a);
        }
        System.out.println(list);
        boolean is=true;
        StringBuilder  sb=new StringBuilder();
        for(String a:list)
        {
            if(is) {
                StringBuilder sb1=new StringBuilder();
                sb1.append(a);
                sb1.reverse();
                sb.append(sb1.toString());
                is=false;
            }
            else
            {
                sb.append(a);
                is=true;
            }
        }
        System.out.println(sb);
        sb.append(s.substring(i));
        System.out.println(sb);
        System.out.println(s.substring(i));
    }
}

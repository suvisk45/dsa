package String;

import java.io.CharConversionException;
import java.util.Collections;
import java.util.HashSet;

public class VowelProb
{
    public static void main(String[] args)
    {
        String str="suvisesh";
        char[] ch=str.toCharArray();
        HashSet<Character> s=new HashSet<>();
        Collections.addAll(s,'a','e','i','o','u');
        for(int i=0;i<ch.length;i++)
        {
            if(i>0 && s.contains(ch[i]))
            {
                char c=ch[i+1];
                ch[i+1]=Character.toUpperCase(c);
            }
        }
        System.out.println(new String(ch));
        }
}

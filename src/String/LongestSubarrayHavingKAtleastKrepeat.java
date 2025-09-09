package String;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubarrayHavingKAtleastKrepeat
{
    public static void main(String[] args)
    {
       String s = "aaabb";
       int k = 3;
        HashMap<Character,Integer> str= new HashMap<>();
        for(char ch:s.toCharArray()) {
            str.put(ch, str.getOrDefault(ch, 0) + 1);
        }
        HashSet<Character> badChars=new  HashSet<>();
        for(char ch:str.keySet())
        {
            if(str.get(ch)<k) badChars.add(ch);
        }
        int start=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++)
        {
            if(i==s.length() || badChars.contains(s.charAt(i)))
            {
                String seg=s.substring(start,i);

            }
        }
    }
}

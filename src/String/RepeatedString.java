package String;

public class RepeatedString {

    public static void main(String[] args)
    {
        String s="abab";
        int temp=1;
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<s.length()-1;i++)
        {
            if(temp==2)
            {
              char ch=s.charAt(i);
              char ch1=s.charAt(i+1);
              str.deleteCharAt(i);
              str.deleteCharAt(i+1);
              str.insert(i,ch1);
              str.insert(i+1,ch);

              temp=0;
            }
            temp++;
        }
        System.out.println(str);
    }
}

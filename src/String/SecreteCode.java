package String;

public class SecreteCode {


    public static void main(String[] rga)
    {
        StringBuilder str=new StringBuilder("974");
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            int ch=Integer.parseInt(String.valueOf(str.charAt(i)));
            ch=ch+1;
            s.append(ch);
        }
        System.out.println(s.length());
    }
}

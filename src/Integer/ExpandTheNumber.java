package Integer;

public class ExpandTheNumber {

    public static void main(String[] args)
    {
        int a=8580;
        StringBuilder str=new StringBuilder(Integer.toString(a));
        String s=str.reverse().toString();
        StringBuilder  sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='0') continue;
            if(s.charAt(i)!='0')
            {
                sb.append( Integer.parseInt( String.valueOf(s.charAt(i)))*((int)Math.pow(10,i)));

                if(i!=0 || s.charAt(i+1)!='0') sb.append("+");
            }
        }
        System.out.println(sb);
    }

}

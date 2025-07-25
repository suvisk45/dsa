package String;

public class goodString {



    public static void main(String[] args) {
        String str = "Suvi@#123$%^ Kishore";
        String special="*#^%@$";
        String s=remove(str,special);
        System.out.println(s);


    }
    public static String remove(String str,String special){
        int s=0;
        StringBuilder sb=new StringBuilder(str);
        int i=0;
        while(i<sb.length())
        {
            System.out.println(sb);
            char ch=sb.charAt(i);
            if(special.indexOf(ch)!=-1){
                sb.deleteCharAt(i);
                System.out.println(sb.charAt(i));

                s=i;
                while(Character.isLetter(sb.charAt(s)))
                {
                    s++;
                }
                sb.deleteCharAt(s);
            }
            else
            {
                i++;
            }
        }
        return sb.toString();

    }
}

package String;

public class LicenseKeyReformat {

    // leetcode assessment
    public static void main(String[] args)
    {
        int k=2;
        String str="2-5g-3-J";
        String[] s=str.split("-");
        String a=" ";
        for(int i=0;i<s.length;i++)
        {
            a+=s[i];
        }
        a=a.trim();
        int len=a.length();
        System.out.println(len);
        int frst=len%k;
        System.out.println("frst"+frst);
        StringBuilder c=new StringBuilder();
        if(frst==0) {
            for (int i = 0; i < a.length(); i = i + k) {
                c.append(a.substring(frst, frst + k));
                frst += k;
                c.append("-");
            }
        }
        else
        {
            c.append(a.substring(0,frst));
            c.append("-");
            System.out.println(c.toString());
            for(int i=frst;i<a.length();i=i+k)
            {
                c.append(a.substring(i,i+k));
                c.append("-");
            }
            if(c.charAt(c.length()-1)=='-') c.deleteCharAt((c.length()-1));
            System.out.println(c.toString());
        }
        System.out.println(c.toString().toUpperCase());


    }
}

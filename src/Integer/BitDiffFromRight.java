package Integer;

public class BitDiffFromRight {
    public static void main(String[] args) {
        int m=15;
        int n=3;
       StringBuilder s1=new StringBuilder( Integer.toBinaryString(m)).reverse();
       StringBuilder s2=new StringBuilder( Integer.toBinaryString(n)).reverse();
       System.out.println(s1);
       System.out.println(s2);
       int l1=s1.length()-1;
       int l2=s2.length()-1;
       int i=0;
       int j=0;
        while(i<=l1 && j<=l2)
        {
            if(s1.charAt(i)!=s2.charAt(j))
            {
                System.out.println(i+1);
                break;
            }
            i++;
            j++;
        }
    }
}

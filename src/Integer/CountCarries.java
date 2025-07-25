package Integer;

public class CountCarries {

    public static void main(String[] args)
    {
        int a=456;
        int b=658;
        String x=Integer.toString(a);
        String y=Integer.toString(b);
        char[] ch=x.toCharArray();
        char[] ch1=y.toCharArray();
        int len=Math.min(ch.length,ch1.length);
        int[] arr1 = new int[ch.length];
        int[] arr2 = new int[ch1.length];
        for (int i = 0; i < ch.length; i++)
        {
            arr1[i] = ch[i] - '0';
        }

        for (int i = 0; i < ch1.length; i++)
        {
            arr2[i] = ch1[i] - '0';
        }

    }
}

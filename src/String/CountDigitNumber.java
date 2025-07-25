package String;

public class CountDigitNumber {

    public static void main(String[] args) {

        int[] arr={3,5};
        int n=2;
        int len=(int)Math.pow(10,n);
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            String str=String.valueOf(arr[i]);
            for(int j=0;j<len;j++) {
                String s = String.valueOf(j);
                if (s.length() == n && s.contains(str))
                {
                    count++;
                    System.out.print(s+" ");
                }
            }

        }
        System.out.println(count);
    }
}

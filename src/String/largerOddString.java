package String;

public class largerOddString {

    public static void main(String[] args)
    {
        String str="52";
        StringBuilder sb=new StringBuilder(str);
        System.out.println( 'a' & 1);
        if(Integer.parseInt(str)%2==1) System.out.print(str);


        else {
            for (int i = str.length() - 1; i >= 0; i--) {
                String s = sb.deleteCharAt(i).toString();
                if (Integer.parseInt(s) % 2 == 1) {
                    System.out.print(s);
                    break;
                }
            }
        }

    }
}

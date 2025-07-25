package Datatype;

public class Datatype {


    public static void main(String[] args)
    {
        byte a=100;
        byte b=100;
        int c=a+b; // jvm will always provide the always a byte + byte as int to avoide the out range
        System.out.println(c);

        String v="suvisk";
        boolean x=true;
        String n=v+x;
        System.out.println(n);
    }
}

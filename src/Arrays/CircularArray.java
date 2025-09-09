package Arrays;


interface Ab
{
    void add(int a);

    void subtract(int a, int b);
}

class B {
    static void add(int a) {
        System.out.println("Adding " + a);
    }
}
interface Ab2 {
    void add(int a,int b);

    public static void add2(int a)
    {
        System.out.println("Adding " + a);
    }

}

public class CircularArray {
    public static void main(String[] args)
    {
        Ab2 ref =  (a, b) ->
        {
            System.out.println("Adding " + a);
        };
        System.out.println(ref);
    }
}

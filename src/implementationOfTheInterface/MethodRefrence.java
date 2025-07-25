package implementationOfTheInterface;


import java.util.Properties;

interface imp2
{
    void add(int a);
}
class A
{
    public  void add(int a)
    {
        System.out.println(a);
    }
}

public class MethodRefrence {
    public static void main(String[] args)
    {
        // this is the static method reference in this we can directly uses the class of the exsisting method
        A a=new A();
        imp2 ip= a::add; // this is the use of the already existed method
        // logic for implementation of the functional interface
        // ()->{ System.out.printlb(a);
        System.out.println(ip); //implementationOfTheInterface.MethodRefrence$$Lambda/0x000001dc16003760@30f39991
        ip.add('b');
    }
}

package FunctionalInteface;

// --> lambda expression is used to pass a function as parameter
// binary operator
// the function used in the lambda expression is anonymous function
// ( a function without any method name ) complier internally connects the anaymous
// function internally to functional interface abstract method

import java.util.Scanner;

interface f // lamba express only a instance of the functional interface implemented class which have reference
    // type is same functional interface
{
    void sub(int a);
    void add(int b,int a);
}
@FunctionalInterface
interface fc
{
    void add(int b);
}

public class LambdaExpression {

    public static void main(String args[])
    {

        // 5
        // 5+6 this is expression
       fc f=b->System.out.println(b); // this is the lambda expression in this step the ab method gets the body
        f.add('7'); // outuout
        System.out.println(f); // FunctionalInteface.LambdaExpression$$Lambda/0x000001f122003548@a09ee92
    }                                                                //($$ means inner class )

}

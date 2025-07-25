package FunctionalInteface;

import java.util.*;

public interface MyPrinter {
    void print(String a);
}
interface Addition
{
    void add(int a,int b);
}
interface EvenChecker
{
    void isEven(int a);
}
interface StringLengthFinder
{
    int lengthFinder(String a);
}
interface StringComparator{
    int compare(String a,String b);
}
class comparator implements Comparator<String>{
    @Override
    public int compare(String a,String b){
        return b.length()-a.length();
    }
}
class Example
{
    public static void main(String[] args)
    {
        MyPrinter mp=(a)->System.out.println(a);
        mp.print("Helllo Lambda !");
        Addition ad=(a,b)->System.out.println(a+b);
        ad.add(10,20);
        EvenChecker ec=(a)->{
            if(a%2==0) System.out.println("Even");
            else System.out.println("Odd");
        };
        ec.isEven(10);
        StringLengthFinder slf=(a)->{
            return a.length();
        };
        System.out.println(slf.lengthFinder("Helllo Lambda !"));
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C", "JavaScript"));
        comparator cp=new comparator();
        Collections.sort(list,cp);
        System.out.println(list);

    }
}

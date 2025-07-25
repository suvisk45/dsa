package FunctionalInteface;





// since java have the multiple datatypes if we want all type of datatype we want the generic datatype
// this is also called static type of programming this is not good practice of the programming
// working with the multiple datatype with same class is called generic type
// generic programming --> we can delcare the datatype dynamically

class Person
{

}
interface summa
{
    static void add()
    {
        System.out.print("suma");
    }
    private void sk()
    {
        System.out.println(" i am the suvisk");
    }
    void addition();
    default void hi()  // for adding extra methods to interface without forcing
    // the childs classes to forcely implement that
    {
        System.out.print("hi");
    }
}
interface Summa2 extends summa
{
    void sub();
}
class suvi implements summa
{
  public void addition()
    {
        System.out.println("i am the super class method");
    }
}
class suvi2 extends suvi implements Summa2
{
    public void sub()
    {
        System.out.println("i am extended version of the Summa2");
    }
}
class sa
{
    public static void main(String[] ag)
    {
        suvi2 sk=new suvi2();
        sk.addition();
    }
}
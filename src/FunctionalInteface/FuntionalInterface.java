package FunctionalInteface;


@FunctionalInterface
interface Summa{
    public void add();
}

@FunctionalInterface
interface Summaa extends Summa{
    @Override
    public void add();

}
@FunctionalInterface
interface Sum
{
    boolean equals(Object obj);
    void add();
}
@FunctionalInterface
interface s{
    void add();
}
@FunctionalInterface
interface su extends Sum,s
{

}
class  sks
{
    public static void main(String[] ag)
    {
    }
}
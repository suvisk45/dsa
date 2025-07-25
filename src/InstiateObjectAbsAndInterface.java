public class InstiateObjectAbsAndInterface {
    public static void main(String[] args)
    {
        bye bye = new hi();// limitation of the default constructor
        bye.hi();
        System.out.println();

    }
}
class hi extends bye
{

    public hi()
    {
        System.out.println("hi");
    }

}
class bye
{
    private int a=10;
    protected void hi()
    {
        System.out.println("hi from bye classs ");
    }

}


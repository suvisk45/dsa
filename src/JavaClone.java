public class JavaClone implements Cloneable  {
    int a=100;
    int b=200;
    Address adr;
    @Override
    public boolean equals(Object obj)
    {
       if(this.getClass()==obj.getClass()) return true;
       return false;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        JavaClone jc1=new JavaClone();
        Address adr=new Address();
        jc1.adr=adr;
        System.out.println(jc1.adr.hashCode());
        jc1.a=200;
        jc1.b=100;
        System.out.println(jc1.a);
        System.out.println(jc1.b);
        System.out.println(jc1.adr.hashCode());
        jc1.adr.area="4a main road";
        jc1.adr.city="Chennai";
       Object obj= jc1.clone();
       JavaClone jc3= (JavaClone)obj;
      System.out.println(jc3.adr.hashCode());
       System.out.println(jc3.adr.area);
       System.out.println(jc3.hashCode());
        JavaClone  jc2=new JavaClone();
        System.out.println(jc2.a);
        System.out.println(jc2.b);
        System.out.println(jc3.equals(jc2));

    }

}
class Address
{
    String area;
    String city;
}

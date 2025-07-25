package implementationOfTheInterface;





//Anonymous inner class --> class within  another class ,
// with that we can quickly implement the interface without seperate class
 interface imp1
{
    void add();
}


public class ByAnonymousInnerClass{

     public static void main(String[] ags)
     {
         imp1 i=new imp1() // t is the reference of the test interface which is holding the address of the implementation of the test interface
         { // this bracket act as the implementation class called ananymous classs
             public void add()
             {
                 System.out.println("add");
             }
         };
         System.out.println(i);
     }
}

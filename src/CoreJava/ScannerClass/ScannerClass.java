package CoreJava.ScannerClass;

import java.util.Scanner;
// ** when the two class are in the two diff package we need to import the class
public class ScannerClass {

    public void add()
    {
        int a=10; // every time the value is same
        int b=20;
        System.out.println("Addition value is ===>"+(a+b));
    }
    public static void main(String args[])
    {
        new ScannerClass().add();
    }
}

package Execptionhandling;

import java.util.Scanner;

public class Handle {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of a number 1:");
            int n = sc.nextInt();
            System.out.println("Enter the value of a number 2:");
            int m = sc.nextInt();
            System.out.println(n);
            System.out.println(m);
        }catch(Exception e){
            System.out.println("invalid input format please enter integer value!!");
        }

        System.out.println(new Handle());
    }

}

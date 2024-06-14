import java.util.Scanner;
import java.lang.System;



class practice1{
    public static void main(String args[])
    {
       Scanner practice1 = new Scanner (System.in);
       String name = practice1.nextLine();
       String address = practice1.nextLine();
       int age = practice1.nextInt();
       System.out.println("my name is "+name);
       System.out.println("my address is "+address);
       System.out.print("my age is "+age);
    } 


    
}
import java.util.Scanner;
import java.lang.System;

class ari{
  public static void main(String args[])
  {
    Scanner ari = new Scanner(System.in);
    int a=ari.nextInt();
    int b=ari.nextInt();
    int c=ari.nextInt();
    int d= a*b*c;
    int e= a+b+c;
 
    System.out.print(d/e);
  }
}
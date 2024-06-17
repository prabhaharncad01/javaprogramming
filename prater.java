import java.util.Scanner;

class ter{
    public static void main (String args[])
    {
        Scanner terprac = new Scanner(System.in);
        System.out.print("enter num 1: ");
        int num1=terprac.nextInt();
        System.out.print("enter num 2: ");
        int num2=terprac.nextInt();

       String result= (num1>num2)?num1+"is greater than "+ num2:num2+"is greater than "+num1;
       System.out.print(result); 


    }
}
import java.util.Scanner;

class eveodd{
    public static void main(String args[])
    {
        Scanner eveodd= new Scanner(System.in);

        int num = eveodd.nextInt();

        if(num%2==0)
        {
            System.out.print("num is even");
        }

        else{
            System.out.print("num is odd");
        }
    }
}
import java.util.Scanner;

class game{
    public static void main(String args[])
    {
         Scanner score = new Scanner(System.in);

         int scored =score.nextInt();


        if(scored<50)
        {
            System.out.print("you need to improve");
        }

         else if(scored>=50 && scored<70)
        {
            System.out.print("goodjob");
        }

         else
        {
            System.out.print("excellent job");
        }
    }
}
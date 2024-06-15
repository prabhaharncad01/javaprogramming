import java.util.Scanner;

class exam{
    public static void main(String args[])
    {
        Scanner exams = new Scanner(System.in);
      int mark = exams.nextInt();

      if (mark>35)
      {
        System.out.print("pass");
      }
      else{
        System.out.print("fail");
      }

    }
}
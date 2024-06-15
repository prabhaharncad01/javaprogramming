import java.util.Scanner;

class div{
  
  public static void main(String args[])
  {
    Scanner div=new Scanner(System.in);
    int num= div.nextInt();
    
    if(num%3==0 || num%5==0)
    {
        System.out.print("number is divisible by 3 or 5");
    }

    else{
        System.out.print("number is not divisible by 3 or 5");
    }
  }
}
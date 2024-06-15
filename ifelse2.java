import java.util.Scanner;

class ifelse2{
    public static void main(String args[])
    {
        
      Scanner elseif2= new Scanner(System.in);
        String rcb = elseif2.nextLine();

        if(rcb.equals("win"))
        {
            System.out.print("e sala cup namthae");
        }

        else{
            System.out.print("cup illa");
        }
    }
}